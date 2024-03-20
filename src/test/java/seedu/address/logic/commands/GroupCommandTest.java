package seedu.address.logic.commands;

import static seedu.address.logic.commands.CommandTestUtil.assertCommandFailure;
import static seedu.address.logic.commands.CommandTestUtil.assertCommandSuccess;
import static seedu.address.testutil.TypicalPersons.getTypicalAddressBook;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

import seedu.address.logic.Messages;
import seedu.address.model.AddressBook;
import seedu.address.model.Model;
import seedu.address.model.ModelManager;
import seedu.address.model.UserPrefs;
import seedu.address.model.person.Person;
import seedu.address.model.person.StudentId;
import seedu.address.testutil.PersonBuilder;
import seedu.address.testutil.TypicalPersons;

public class GroupCommandTest {
    private Model model = new ModelManager(getTypicalAddressBook(), new UserPrefs());

    /**
     * Checks that Alice's group is correctly changed to group 99.
     */
    @Test
    public void execute_allFieldsSpecifiedUnfilteredList_success() {

        //change alice to group 99
        Person editedPerson = new PersonBuilder(TypicalPersons.ALICE).withGroups("Group 99").build();
        HashSet<StudentId> studentIds = new HashSet<>();
        studentIds.add(editedPerson.getStudentId());
        GroupCommand groupCommand = new GroupCommand(editedPerson.getGroups(), studentIds);

        String expectedMessage = String.format(GroupCommand.MESSAGE_GROUP_SUCCESS, Messages.format(editedPerson));

        Model expectedModel = new ModelManager(new AddressBook(model.getAddressBook()), new UserPrefs());
        expectedModel.setPerson(model.getFilteredPersonList().get(0), editedPerson);

        assertCommandSuccess(groupCommand, model, expectedMessage, expectedModel);
    }

    /**
     * Checks that trying to modify the student ID of someone not in the list fails.
     * Currently, GroupCommand will add found IDs to the specified group, while
     * throwing an exception if there are any unfound IDs at all.
     */
    @Test
    public void execute_invalidPersonIndexUnfilteredList_failure() {
        //tries to put a person with (unfound) ID "A9999999Z" in Group 99.
        Person editedPerson = new PersonBuilder().withStudentId("A9999999Z")
                .withGroups("Group 99").build();
        HashSet<StudentId> studentIds = new HashSet<>();
        studentIds.add(editedPerson.getStudentId());
        GroupCommand groupCommand = new GroupCommand(editedPerson.getGroups(), studentIds);

        assertCommandFailure(groupCommand, model, GroupCommand.STUDENTS_NOT_FOUND + "A9999999Z ");
    }
}
