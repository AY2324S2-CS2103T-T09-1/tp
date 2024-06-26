package seedu.teachstack.logic;

import java.nio.file.Path;

import javafx.collections.ObservableList;
import seedu.teachstack.commons.core.GuiSettings;
import seedu.teachstack.logic.commands.CommandResult;
import seedu.teachstack.logic.commands.exceptions.CommandException;
import seedu.teachstack.logic.parser.exceptions.ParseException;
import seedu.teachstack.model.ReadOnlyAddressBook;
import seedu.teachstack.model.ReadOnlyArchivedBook;
import seedu.teachstack.model.person.Person;

/**
 * API of the Logic component
 */
public interface Logic {
    /**
     * Executes the command and returns the result.
     * @param commandText The command as entered by the user.
     * @return the result of the command execution.
     * @throws CommandException If an error occurs during command execution.
     * @throws ParseException If an error occurs during parsing.
     */
    CommandResult execute(String commandText) throws CommandException, ParseException;

    /**
     * Returns the AddressBook.
     *
     * @see seedu.teachstack.model.Model#getAddressBook()
     */
    ReadOnlyAddressBook getAddressBook();

    /**
     * Returns the ArchivedBook.
     *
     * @see seedu.teachstack.model.Model#getArchivedBook()
     */
    ReadOnlyArchivedBook getArchivedBook();


    /** Returns an unmodifiable view of the filtered list of persons */
    ObservableList<Person> getFilteredPersonList();

    /** Returns an unmodifiable view of the filtered list of archived persons */
    ObservableList<Person> getFilteredArchivedList();

    /**
     * Returns the user prefs' address book file path.
     */
    Path getAddressBookFilePath();

    /**
     * Returns the user prefs' archived book file path.
     */
    Path getArchivedBookFilePath();

    /**
     * Returns the user prefs' GUI settings.
     */
    GuiSettings getGuiSettings();

    /**
     * Set the user prefs' GUI settings.
     */
    void setGuiSettings(GuiSettings guiSettings);
}
