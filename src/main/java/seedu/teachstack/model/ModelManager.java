package seedu.teachstack.model;

import static java.util.Objects.requireNonNull;
import static seedu.teachstack.commons.util.CollectionUtil.requireAllNonNull;

import java.nio.file.Path;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.logging.Logger;

import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import seedu.teachstack.commons.core.GuiSettings;
import seedu.teachstack.commons.core.LogsCenter;
import seedu.teachstack.model.person.Person;
import seedu.teachstack.model.person.StudentId;

/**
 * Represents the in-memory model of the address book data.
 */
public class ModelManager implements Model {
    private static final Logger logger = LogsCenter.getLogger(ModelManager.class);
    private static Predicate<Person> startingFilter = PREDICATE_SHOW_ALL_PERSONS;

    private final AddressBook addressBook;
    private final ArchivedBook archivedBook;
    private final UserPrefs userPrefs;
    private final FilteredList<Person> filteredPersons;
    private final FilteredList<Person> filteredArchivedPersons;

    /**
     * Initializes a ModelManager with the given addressBook and userPrefs.
     */
    public ModelManager(ReadOnlyAddressBook addressBook, ReadOnlyArchivedBook archivedBook,
                        ReadOnlyUserPrefs userPrefs) {
        requireAllNonNull(addressBook, userPrefs);

        logger.fine("Initializing with address book: " + addressBook + " and user prefs " + userPrefs);

        this.addressBook = new AddressBook(addressBook);
        this.archivedBook = new ArchivedBook(archivedBook);
        this.addressBook.sort();
        this.archivedBook.sort();
        this.userPrefs = new UserPrefs(userPrefs);
        filteredPersons = new FilteredList<>(this.addressBook.getPersonList());
        updateFilteredPersonList(startingFilter);
        filteredArchivedPersons = new FilteredList<>(this.archivedBook.getArchivedList());
    }

    public ModelManager() {
        this(new AddressBook(), new ArchivedBook(), new UserPrefs());
    }

    //=========== UserPrefs ==================================================================================

    @Override
    public void setUserPrefs(ReadOnlyUserPrefs userPrefs) {
        requireNonNull(userPrefs);
        this.userPrefs.resetData(userPrefs);
    }

    @Override
    public ReadOnlyUserPrefs getUserPrefs() {
        return userPrefs;
    }

    @Override
    public GuiSettings getGuiSettings() {
        return userPrefs.getGuiSettings();
    }

    @Override
    public void setGuiSettings(GuiSettings guiSettings) {
        requireNonNull(guiSettings);
        userPrefs.setGuiSettings(guiSettings);
    }

    @Override
    public Path getAddressBookFilePath() {
        return userPrefs.getAddressBookFilePath();
    }

    @Override
    public void setAddressBookFilePath(Path addressBookFilePath) {
        requireNonNull(addressBookFilePath);
        userPrefs.setAddressBookFilePath(addressBookFilePath);
    }

    @Override
    public Path getArchivedBookFilePath() {
        return userPrefs.getArchivedBookFilePath();
    }

    @Override
    public void setArchivedBookFilePath(Path archivedBookFilePath) {
        requireNonNull(archivedBookFilePath);
        userPrefs.setArchivedBookFilePath(archivedBookFilePath);
    }

    //=========== AddressBook ================================================================================

    @Override
    public void setAddressBook(ReadOnlyAddressBook addressBook) {
        this.addressBook.resetData(addressBook);
        this.addressBook.sort();
    }

    @Override
    public ReadOnlyAddressBook getAddressBook() {
        return addressBook;
    }

    @Override
    public void setArchivedBook(ReadOnlyArchivedBook archivedBook) {
        this.archivedBook.resetData(archivedBook);
        this.archivedBook.sort();
    }

    @Override
    public ReadOnlyArchivedBook getArchivedBook() {
        return archivedBook;
    }

    @Override
    public boolean hasPerson(Person person) {
        requireNonNull(person);
        return addressBook.hasPerson(person);
    }

    @Override
    public boolean hasId(Person person) {
        requireNonNull(person);
        return addressBook.hasId(person);
    }

    @Override
    public boolean hasEmail(Person person) {
        requireNonNull(person);
        return addressBook.hasEmail(person);
    }

    @Override
    public void deletePerson(Person target) {
        addressBook.removePerson(target);
    }

    @Override
    public void addPerson(Person person) {
        addressBook.addPerson(person);
        addressBook.sort();
        updateFilteredPersonList(PREDICATE_SHOW_ALL_PERSONS);
    }

    @Override
    public void setPerson(Person target, Person editedPerson) {
        requireAllNonNull(target, editedPerson);
        addressBook.setPerson(target, editedPerson);
        addressBook.sort();
    }

    @Override
    public Person getPerson(StudentId id) {
        List<Person> lastShownList = getAddressBook().getPersonList();

        Optional<Person> personOptional = lastShownList.stream()
                .filter(p -> p.getStudentId().equals(id))
                .findFirst();

        return personOptional.orElse(null);
    }

    @Override
    public List<Person> getWeak() {
        List<Person> weak = getAddressBook().getPersonList().filtered(person -> {
            return person.isWeak();
        });
        return weak;
    }

    @Override
    public void setArchivedPerson(Person target, Person editedPerson) {
        requireAllNonNull(target, editedPerson);
        archivedBook.setPerson(target, editedPerson);
        archivedBook.sort();
    }

    @Override
    public Person getArchivedPerson(StudentId id) {
        List<Person> lastShownList = getArchivedBook().getArchivedList();

        Optional<Person> personOptional = lastShownList.stream()
                .filter(p -> p.getStudentId().equals(id))
                .findFirst();

        return personOptional.orElse(null);
    }

    @Override
    public void archivePerson(Person person) {
        archivedBook.addPerson(person);
        deletePerson(person);
    }

    @Override
    public void unarchivePerson(Person person) {
        deleteArchivedPerson(person);
        addPerson(person);
    }

    @Override
    public void deleteArchivedPerson(Person target) {
        archivedBook.removePerson(target);
    }

    @Override
    public boolean hasArchivedPerson(Person person) {
        requireNonNull(person);
        return archivedBook.hasPerson(person);
    }

    @Override
    public boolean hasArchivedId(Person person) {
        requireNonNull(person);
        return archivedBook.hasArchivedId(person);
    }

    @Override
    public boolean hasArchivedEmail(Person person) {
        requireNonNull(person);
        return archivedBook.hasArchivedEmail(person);
    }

    //=========== Filtered Person List Accessors =============================================================

    /**
     * Returns an unmodifiable view of the list of {@code Person} backed by the internal list of
     * {@code versionedAddressBook}
     */
    @Override
    public ObservableList<Person> getFilteredPersonList() {
        return filteredPersons;
    }

    @Override
    public void updateFilteredPersonList(Predicate<Person> predicate) {
        requireNonNull(predicate);
        filteredPersons.setPredicate(null);
        filteredPersons.setPredicate(predicate);
    }

    @Override
    public ObservableList<Person> getFilteredArchivedList() {
        return filteredArchivedPersons;
    }

    @Override
    public void updateFilteredArchivedList(Predicate<Person> predicate) {
        requireNonNull(predicate);
        filteredArchivedPersons.setPredicate(predicate);
    }

    public static void setStartingFilter(Predicate<Person> predicate) {
        startingFilter = predicate;
    }

    public static Predicate<Person> getStartingFilter() {
        return startingFilter;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof ModelManager)) {
            return false;
        }

        ModelManager otherModelManager = (ModelManager) other;
        return addressBook.equals(otherModelManager.addressBook)
                && archivedBook.equals(otherModelManager.archivedBook)
                && userPrefs.equals(otherModelManager.userPrefs)
                && filteredPersons.equals(otherModelManager.filteredPersons)
                && filteredArchivedPersons.equals(otherModelManager.filteredArchivedPersons);
    }

}
