---
layout: page
title: User Guide
---


<img src="images/teachstack.png" alt="TeachStack Logo" style="width: 50%;">

Welcome to TeachStack!

At TeachStack, our mission is simple: to ensure every computer science student receives the support they need to succeed.
Designed specifically for Command Line Interface (CLI) users like you, TeachStack is an intuitive and
customizable application that empowers instructors to actively manage their students through group-building features,
archiving, and strength categorization.

Join us on this journey of educational excellence with TeachStack. Together, let's empower students and elevate the standard of computer science education.

Happy teaching!

## Table of contents
- [Table of Contents](#table-of-contents)
- [1. Welcome](#1-welcome)
- [2. How to use this user guide](#2-how-to-use-the-user-guide)
    - [2.1 Terminologies and Symbols](#21-terminologies--symbols)
- [3. Target User](#3-target-useraudience)
    - [3.1 Assumptions](#31-assumptions)
- [4. Purpose of User Guide (UG)](#4-purpose-of-user-guide-ug)
- [5. Quick Start](#5-quick-start)
- [6 Understanding our graphical user interface](#6-understanding-our-gui)
- [7. Features](#7-features)
    - [7.1 Viewing Help](#71-viewing-help--help)
    - [7.2 Adding a student](#72-adding-a-student--add)
    - [7.3 Listing all students](#73-listing-all-students--list)
    - [7.4 Editing a student](#74-editing-a-student--edit)
    - [7.5 Viewing a student](#75-viewing-students-by-name--view)
    - [7.6 Deleting a student](#76-deleting-a-person--delete)
    - [7.7 Forming focus groups](#77-forming-focus-groups)
      - [7.7.1 Forming focus groups manually](#771-forming-focus-groups-manually--group)
      - [7.7.2 Forming focus groups randomly](#772-forming-random-groups--random)
    - [7.8 Filtering students by groups](#78-filtering-students-by-groups--find)
    - [7.9 Clearing all entries](#79-clearing-all-entries--clear)
    - [7.10 Archiving Features](#710-archiving-features)
      - [7.10.1 Archiving a student](#7101-archiving-a-student--archive)
      - [7.10.2 Editing an archived student](#7102-editing-an-archived-student--edit_archived)
      - [7.10.3 Deleting an archived student](#7103-deleting-an-archived-student--delete_archived)
      - [7.10.4 Unarchiving a student](#7104-unarchiving-a-student--unarchived)
      - [7.10.5 Clearing all entries](#7105-clearing-all-entries--clear_archived)
    - [7.11 Exiting the program](#711-exiting-the-program--exit)
    - [7.12 Saving data](#712-saving-the-data)
    - [7.13 Editing the data file](#713-editing-the-data-file)
    - [7.14 Setting a weak threshold](#714-setting-weak-threshold--setweak)
    - [7.15 Viewing summary statistics](#715-viewing-summary-statistics--summary)
- [8. Glossary](#8-glossary)
- [9. FAQ](#9-faq)
    - [9.1 General concerns](#91-general-concerns)
    - [9.2 Using TeachStack](#92-using-teachstack)
- [10. Known Issues](#10-known-issues)
- [11. Command Summary](#11-command-summary)

      

--------------------------------------------------------------------------------------------------------------------

## 1. Welcome!

Thank you for choosing to use TeachStack! Our product aims to help you allocate resources to keep track of weaker students,
and is optimized to be used with the Command Line Interface (CLI).

This is achieved through the use of focus groups, which are groups consisting of students of a weaker skill level.
Focus groups can then be assigned teaching resources such as consultation slots, instructors, teaching venues, and more.
By teaching students of a similar skill level together (i.e. ability grouping), you can tailor your teaching to fit a specific student demographic
instead of a one-size-fits-all approach, saving you time and effort.
Not to mention, ability grouping is [proven to improve the group's progress as a whole.](https://www.ctd.northwestern.edu/blog/what-one-hundred-years-research-says-about-ability-grouping-and-acceleration-students-k-12)
So, are you ready to help students in need?


--------------------------------------------------------------------------------------------------------------------
## 2. How to use the user guide

This guide explains how you can use TeachStack to manage weaker students. It will walk you through each feature and functionality of the app, ensuring you're equipped to make the most of TeachStack's capabilities.

* To get started with TeachStack. [Quick start](#5-quick-start)
* To understand the GUI. [Understanding our GUI](#6-understanding-our-gui)
* To see details of the commands and features. [Features](#7-features)
* To quickly navigate to a specific section. [Table of contents](#table-of-contents)
* To see an overview of all commands. [Command summary](#11-command-summary)
* If you encounter any technical term, please refer to the glossary. [Glossary](#8-glossary)
* If you encounter any problem, you may find your answer in the FAQ. [FAQ](#9-faq)

### 2.1 Terminologies / Symbols

Extra information are given in boxes:
* <div markdown="block" class="alert alert-info">:information_source: denotes additional information</div>
* <div markdown="block" class="alert alert-warning">:exclamation: denotes warning that can cause error</div>

The explanation of each command will be formatted in the following convention:
1. What the command does
2. The format of the command
3. Valid values that the command can take in
4. Example usages
5. _Optional Screenshot_

--------------------------------------------------------------------------------------------------------------------
## 3. Target user/audience

TeachStack is tailored for computer science instructors, currently only for those in NUS.

## 3.1 Assumptions
1. We assume that users are passionate educators who wish to see their students succeed. This is important as TeachStack mainly allows instructors to track the performance of weaker students, so the application can only demonstrate its full potential in the hands of instructors who care.
2. We also assume that users are somewhat familiar with computers and have used computer applications in the past, which will help them follow this guide and use TeachStack effectively. Since most instructors will have used similar applications (e.g. Canvas), this is a reasonable assumption to make.

--------------------------------------------------------------------------------------------------------------------

## 4. Purpose of User Guide (UG)

The purpose of the User Guide (UG) for TeachStack is to provide users
with a comprehensive understanding of the application's features and
functionalities. Structured to facilitate ease of use and enhance productivity,
the guide offers clear instructions, detailed explanations, and reference
materials such as command summaries and a glossary. By empowering users
with the knowledge to efficiently navigate TeachStack's Command Line Interface (CLI)
and Graphical User Interface (GUI), the UG aims to streamline student management tasks
and ensure optimal utilization of the application's capabilities.

--------------------------------------------------------------------------------------------------------------------

## 5. Quick start

1. Ensure you have Java `11` or above installed in your Computer.

2. Download the latest `TeachStack.jar` from [here](https://github.com/AY2324S2-CS2103T-T09-1/tp/releases).

3. Copy the file to the folder you want to use as the _home folder_ for your TeachStack.

4. Open a command terminal, `cd` into the folder you put the jar file in, and use the `java -jar TeachStack.jar` command to run the application.<br>
   A GUI similar to the below should appear in a few seconds. Note how the app contains some sample data.<br>
   ![Ui](images/Ui.png)

5. Type the command in the command box and press Enter to execute it. e.g. typing **`help`** and pressing Enter will open the help window.<br>
   Some example commands you can try:

    * `list` : Lists all students.
    * `add id/A0123459H n/John Doe e/e0123456@u.nus.edu g/B` : Adds a student named `John Doe` to the list.
    * `delete A0123459H` : Deletes the student with student id A0123459H from the list.
    * `clear` : Deletes all students.
    * `exit` : Exits the app.

6. Refer to the [Features](#7-features) below for details of each command.

--------------------------------------------------------------------------------------------------------------------

## 6. Understanding our GUI
![gui screenshot](images/understandingUi.png)
1. Menu Bar: Provides a selection of menu items:
    - File
      - Exit: Allows you to close the application.
    - Help
      - Help: Shows a message on how to access the help page.
    - Theme
      - Dark: Switches the application theme to a dark mode for better visibility in dark environments.
      - Light: Switches the application theme to a light mode for better visibility in bright environments. Theme is set to light mode by default.
2. Command Box: Type in commands to be executed here.
3. Result Display Box: Displays commands' results and any errors.
4. List Selection Bar: Provides a selection of student lists to view:
    - Persons: Displays active student list.
    - Archived: Displays archived student list.
5. Student List: Lists students and their details.
6. Weak marker: Indicates a weaker student.
7. Group labels: Indicates the groups in which a student belongs to.

--------------------------------------------------------------------------------------------------------------------
## 7. Features

<div markdown="block" class="alert alert-info">

**:information_source: Notes about the command format:**<br>

* Words in `UPPER_CASE` are the parameters to be supplied by the user.<br>
  e.g. in `add n/NAME`, `NAME` is a parameter which can be used as `add n/John Doe`.

* Items in square brackets are optional.<br>
  e.g. `n/NAME [gp/GROUP]` can be used as `n/John Doe gp/Group 1` or as `n/John Doe`.

* Ellipsis after a parameter indicates that the command can take in multiple values for the parameter.<br>
  e.g. `id/STUDENT_ID…` can be used as `id/A0123434A id/A0232356C` or as `id/A0123434A`.

* Parameters can be in any order.<br>
  e.g. if the command specifies `n/NAME e/EMAIL`, `e/EMAIL n/NAME` is also acceptable.

* Extraneous parameters for commands that do not take in parameters (such as `help`, `list`, `exit` and `clear`) will be ignored.<br>
  e.g. if the command specifies `help 123`, it will be interpreted as `help`.

* Extraneous parameters for commands that do take in parameters (such as `delete` and  `group`) will be ignored.<br>
  e.g. command `delete A0123432A n/John` or `group gp/Group 3 id/A0123212A id/A4938274F n/John` is invalid.

* If you are using a PDF version of this document, be careful when copying and pasting commands that span multiple lines as space characters surrounding line-breaks may be omitted when copied over to the application.
</div>

### 7.1 Viewing help : `help`

Shows a message explaining how to access the help page.

![help message](images/helpMessage.png)

Format: `help`


### 7.2 Adding a student : `add`

Adds student details to the person list.

Format: `add id/STUDENT_ID n/NAME e/EMAIL g/GRADE [gp/GROUP_NAME]​...`

* `NAME`, `STUDENT_ID`, `GRADE`, and `EMAIL` must be specified, `GROUP_NAME` is optional.
* `NAME` is case-sensitive.
    * e.g. `John Doe is different from john doe`
* `STUDENT_ID` should **start with A follow by 7 digits and ends with a letter [A-Z]**.
    * e.g. `A0123459X`
* `EMAIL` should be of the format **local-part@domain**. The local-part should only be in the **format of e/E follow by 7 digits from [0-9]**. The **domain name must end with a domain label u.nus.edu**.
    * e.g. `e0123456@u.nus.edu`
* `GRADE` should be one of the valid grades: **[A+, A, A-, B+, B, B-, C+, C, D+, D, F]**.


Example:
* `add id/A0123459X n/John Doe e/e0123456@u.nus.edu g/A` adds the person named John Doe with student_id "A0123459X", email "e0123456@u.nus.edu" and grade "A" to the list.

Expected output:
![AddUi](images/AddUI.png)

### 7.3 Listing all students : `list`

Shows a list of all students, ordered by grades in descending order ie. **[F, D, D+, C, C+, B-, B, B+, A- A, A+]**.

Format: `list`

* Displays student's email that is a clickable link to open the user's mailbox with a new email to the student's email address.


### 7.4 Editing a student : `edit`

Edits an existing person in the list of students.

Format: `edit STUDENT_ID [id/STUDENT_ID] [n/NAME] [e/EMAIL] [g/GRADE] [gp/GROUP_NAME]...`

* Edits the person with the specified `STUDENT_ID`.
* The `STUDENT_ID` refers to the id corresponding to the student in the list.
* The `STUDENT_ID` is case-sensitive, must be a String starting with ‘A’ and ending with any letter, with a total length of 9
* The student with the specified `STUDENT_ID` must exist in the list.
* Existing value will be updated to the input value.
* `NAME` is case-sensitive, eg. john doe is different from John Doe
* Email must have the correct domain (@u.nus.edu) and string length of 8 for the email username eg. e0000000@u.nus.edu
* `GRADE` should be one of the valid grades: **[A+, A, A-, B+, B, B-, C+, C, D+, D, F]**.
* Editing `GROUP` will overwrite existing `GROUP` entries.
* Use of `GROUP` prefix `gp/` in an edit command without specifying `GROUP_NAME` will clear all existing `GROUP` of the student.

Examples:
*  `edit A0123459X e/e0123450@u.nus.edu` Edits the email address of the person with student_id = A0123459X to be `e0123450@u.nus.edu`.
*  `edit A0123459X n/John Doe` Edits the name of the person with student_id = A0123459X to be `John Doe`.

Expected output:
![EditUI](images/EditUI.png)

### 7.5 Viewing students : `view`

Shows the detailed information of the student with the specified student_id.

Format: `view STUDENT_ID`

* Returns the detailed information of the student with the corresponding `STUDENT_ID`.
* The `STUDENT_ID` is case-sensitive.
* The `STUDENT_ID` starts with A, ends with a letter, and it must be 9 characters long.
* This feature is not applicable to the archived list, i.e. you can only view current students.

Examples:
* `view A0123459X` Shows the detailed information of the student with `STUDENT_ID = A0123459X`

### 7.6 Deleting a student : `delete`

Deletes the specified student from the list.

Format: `delete STUDENT_ID`

* Deletes the person at the specified `STUDENT_ID`.
* The `STUDENT_ID` refers to the id corresponding to the student in the list.
* The `STUDENT_ID` is case-sensitive, must be a String starting with ‘A’ and ending with any letter, with a total length of 9
* The student with the specified `STUDENT_ID` must exists in the list.


Examples:
* `delete A0123459X` deletes the student with `STUDENT_ID = A0123459X` from the list.

Expected output:
![DeleteUI](images/DeleteUI.png)

### 7.7 Forming focus groups

#### 7.7.1 Forming focus groups manually : `group`
Creates a group with people corresponding to the selected IDs.

Format: `group gp/GROUP_NAME… id/STUDENT_ID…` (multiple groups, IDs allowed)

* Forms a group with the specified `GROUP_NAME`.
* The group name includes students with the corresponding `STUDENT_IDs`.
* If any of the given `STUDENT_IDs` do not exist, the command completely fails.
* `GROUP_NAME` cannot be empty, and must only contain alphanumeric characters and space.
* *Giving no parameter for `GROUP_NAME` will clear the given students' current groups!*

Examples:
* `group gp/3 id/A0123456X id/A0123456H` forms a group called `3` with 2 students in it.
* `group id/A0123456X id/A0123456H` removes the corresponding 2 students from any groups they are currently in.

#### 7.7.2 Forming random groups : `random`
Puts all students marked as weak into the specified number of groups.

Format: `random NUMBER_OF_GROUPS gp/GROUP_NAME`

* Form groups `NUMBER_OF_GROUPS` with the specified `GROUP_NAME` followed by numbering.
* The `NUMBER_OF_GROUPS` refers to the number of groups to distribute students into.
* `NUMBER_OF_GROUPS` must be a positive integer that is smaller than the number of students marked as weak.
* `GROUP_NAME` cannot be empty, and must only contain alphanumeric characters and space.


Examples:
* `random 3 gp/Random Group` randomly distributes all weaker students into 3 groups: Random Group 1, Random Group 2, Random Group 3.

<div markdown="block" class="alert alert-info">

**:information_source: Notes about groups formed:**<br>

* Group formed cannot be deleted individually unless using the [`group` command](#771-forming-focus-groups-manually--group) to clear all groups <br>
  eg. `group id/A0123459X` removes student with `STUDENT_ID = A0123459X` from all the groups the student was in.
* Random groups formed will not be affected by the [`setweak` command](#714-setting-weak-threshold--setweak)<br>
  ie. student in a randomly formed group will remain in the group after `setweak` command, even if the student falls above the new weak threshold

</div>

### 7.8 Filtering students by groups : `find`
Updates the list to display only students that are in the group(s) specified.

Format: `find gp/GROUP_NAME…`

* At least one `GROUP_NAME` must be specified. Otherwise, the command will fail.
* If multiple `GROUP_NAME`s are specified, only students who are in all groups entered will be displayed.
* `GROUP_NAME` cannot be empty, and must only contain alphanumeric characters and space.
* Only the `persons` list will be updated, `archived` list will not be updated.
* Result displayed refers to the number of students found in the `persons` list.

Examples:
* `find gp/Group 1` will update the list to display all students assigned to Group 1.
* `find gp/Group 1 gp/Group 2` will update the list to display all students assigned to both Group 1 and Group 2.

### 7.9 Clearing all entries : `clear`

Clears all entries from the list of students.

Format: `clear`


### 7.10 Archiving Features
#### 7.10.1 Archiving a student : `archive`

Archives a student from the person list to the archived list.

Format: `archive STUDENT_ID`

* Archives a student with the specified `STUDENT_ID`.
* `Student_ID` should **start with A follow by 7 digits and ends with a letter [A-Z]**.
    * e.g. `A0123459X`
* The student with the specified `STUDENT_ID` must exists in the person list.

Example:
* `archive A0123459X` archives a student with the student_id "A0123459X".

Expected output:
![](images/ArchiveUI.png)

#### 7.10.2 Editing an archived student : `edit_archived`

Edits details of an archived student.

Format: `edit_archived STUDENT_ID [id/STUDENT_ID] [n/NAME] [e/EMAIL] [g/GRADE] [gp/GROUP_NAME]...`

* Edits the details of an archived student with the specified `STUDENT_ID`.
* At least one of the optional fields indicated within the square bracket must be provided.
* The `...` after the `GROUP_NAME` indicates that multiple `GROUP_NAME` can be provided for editing.
* The student with the specified `STUDENT_ID` must exists in the archived list.
* This feature is only applicable to the archived list.

Examples:
* `edit_archived A0123459X g/B e/e0237861@u.nus.edu` edits the grade of the student with student_id "A0123459X" to "B" and the email to "e0237861@u.nus.edu".

Expected output:
![](images/EditArchivedUI.png)

#### 7.10.3 Deleting an archived student : `delete_archived`

Deletes an archived student from the archived list.

Format: `delete_archived STUDENT_ID`

* Deletes an archived student with the specified `STUDENT_ID`.
* `Student_ID` should **start with A follow by 7 digits and ends with a letter [A-Z]**.
    * e.g. `A0123459X`
* The student with the specified `STUDENT_ID` must exists in the archived list.
* This feature is only applicable to the archived list.

Example:
* `delete_archived A0123459X` deletes the student with student_id "A0123459X" from the archived list.

Expected output:
![](images/DeleteArchivedUI.png)

#### 7.10.4 Unarchiving a student : `unarchived`

Unarchives a student from the archived list to the person list.

Format: `unarchived STUDENT_ID`

* Unarchives a student with the specified `STUDENT_ID`.
* `Student_ID` should **start with A follow by 7 digits and ends with a letter [A-Z]**.
    * e.g. `A0123459X`
* The student with the specified `STUDENT_ID` must exists in the archived list.
* This feature is only applicable to the archived list.

Examples:
* `unarchived A0123459X` unarchives a student with the student_id "A0123459X".

Expected output:
![](images/UnarchivedUI.png)

#### 7.10.5 Clearing all entries : `clear_archived`

Clears all entries from the archived list.

* This feature is only applicable to the archived list.

Format: `clear_archived`

### 7.11 Exiting the program : `exit`

Exits the program.

Format: `exit`

### 7.12 Saving the data

TeachStack data is saved in the hard disk automatically after any command that changes the data. There is no need to save manually.

### 7.13 Editing the data files

TeachStack data is saved automatically as a JSON file `[JAR file location]/data/addressbook.json` and `[JAR file location]/data/userdata.json`. Advanced users are welcome to update data directly by editing that data file.

<div markdown="span" class="alert alert-warning">:exclamation: **Caution:**
If your changes to the data files makes its format invalid, TeachStack will discard all data and start with an empty data file at the next run. Hence, it is recommended to take a backup of the file before editing it.<br>
Furthermore, certain edits can cause the TeachStack to behave in unexpected ways (e.g., if a value entered is outside of the acceptable range). Therefore, edit the data file only if you are confident that you can update it correctly.
</div>

### 7.14 Setting weak threshold : `setweak`

Sets the weakness threshold for a weak marker.

Format: `setweak g/GRADE`

* By default, weakness threshold is set at Grade: C+
* Updates weakness threshold value
* Students with grade lower or equal to threshold grade appear with a marker in the UI
* `GRADE` should be one of the valid grades: **[A+, A, A-, B+, B, B-, C+, C, D+, D, F]**.
* After setting the threshold, it will be maintained even after shutting down the application.

Example:
* `setweak g/B` displays a weak marker for all students with grade B or lower.

Default Weakness Threshold

![](images/setWeakBefore.png)

After command `setweak B`

![](images/setWeakAfter.png)

### 7.15 Viewing summary statistics : `summary`

Displays a summary of all students.

Format: `summary`

* Entering command opens a popup.
* Popup contains statistics: Total Students, Average Grade, and Standard Deviation of Grades.
* Popup contains pie chart of students' grades.

Displayed after command: `summary`
![](images/summary.png)

--------------------------------------------------------------------------------------------------------------------
## 8. Glossary

* **GUI**: Graphical User Interface. An interface that uses visual representations, such as icons, buttons and windows where users can use to interact with the system.
* **CLI**: Command Line Interface. A text-based interface that allows users to interact with the application by typing commands. Command is parsed to the system when users hit `Enter`.
* **JAR**: Java Archive. Package file format used to aggregate the Java class files and associated metadata and resources required to run `TeachStack` into one file to distribute the application.
* **Student**: Student studying at NUS and instructed by the user.
* **Student ID**: Unique matriculation number of an NUS student. `TeachStack` only accepts a student id that starts with '**A**', followed by 7 consecutive digits and ends with a capital letter '**[A-Z]**'.
* **Email**: An electronic mail address. `TeachSTack` only accepts NUS email addresses in the format '**eXXXXXXX@u.nus.edu**' where '**X**' can be any digit.
* **Grade**: A letter that shows how good a student's performance is. `TeachStack` only accepts grades that exist in the NUS grading system (**[A+, A, A-, B+, B, B-, C+, C, D+, D, F]**).
* **Name**: Name of a student. `TeachStack` only accepts name consisting of alphabets, numbers and space.
* **Focus group**: Group of students such that the user can pay more attention to assist the students in the group. Indicated by a `Group label` on the GUI
* **Student details**: The student's name, id, email address, grade, and focus group that the student belongs in if any. 
* **Grade threshold**: A threshold used by the system to determine if a student is considered as `weak` based on grades. If the student's grade falls below or is at the threshold, the student is considered as weak. It is set to **C+** by default and user can update using the `setweak` command to set expected performance.
* **Summary statistics**: Statistics of all active students (not in archived list), including the total number of students, mean grade, standard deviation of grade and a pie chart showing grade distribution. 

--------------------------------------------------------------------------------------------------------------------

## 9. FAQ

### 9.1 General concerns

**Q**: Is TeachStack free to use?<br>
**A**: Yes! TeachStack is completely free to use. We believe in making student management accessible to all computer science instructors. Enjoy the full functionality of TeachStack without any subscription fees or hidden charges.

**Q**: I am facing issues/want to give suggestions for TeachStack. How can I resolve them?<br>
**A**: Not to worry! Our developer team is committed to ensuring the best experience for instructors like you. Please submit any issues/suggestions you might have to our Google form [here](https://docs.google.com/forms/d/e/1FAIpQLSeA7P9esEWx154CtjAubVDsb2ULjui6Vwuk7HPEAVUe1Or3Tw/viewform?usp=sf_link). Alternatively, you can also file them on our Github repository [here](https://github.com/AY2324S2-CS2103T-T09-1/tp/issues). We appreciate your feedback and will respond as soon as possible.

**Q**: Is TeachStack suitable for use for computer science instructors outside of NUS?<br>
**A**: For now, the application is only meant to be used within NUS. However, we do plan to make improvements to allow all computer science instructors, regardless of educational institution, to utilise the application, so do keep an eye out for future developments!

**Q**: Is TeachStack suitable for Teaching Assistants (TAs)?<br>
**A**: While TeachStack is currently tailored for computer science instructors to simplify managing large student bodies, TAs may also find our app useful, especially in scenarios with larger class sizes. We continually strive to expand TeachStack's capabilities to better serve the diverse needs of educators and teaching teams.

**Q**: Is TeachStack really better than Canvas, Excel, etc. for me?
**A**: Yes! While the other platforms do offer valuable features, TeachStack stands out with its CLI, intuitive group forming, archiving, and other tailored features designed specifically for computer science educators. What sets TeachStack apart is our commitment to continuous improvement and development, driven by your feedback. With ongoing enhancements, we're dedicated to ensuring TeachStack remains the preferred choice for instructors seeking to elevate their teaching experience.

### 9.2 Using TeachStack

**Q**: How do I transfer my data to another computer?<br>
**A**: Install the app in the other computer and overwrite the empty data file it creates with the file that contains the data of your previous TeachStack home folder.

**Q**: I made changes to the data files manually and I am now facing errors! What should I do?
**A**: We recommend that you only manually edit the files if you are confident that you can update it correctly. In the event that you run into errors after manually editing the files, please delete the `[JAR file location]/data` folder so TeachStack can create new files.

**Q**: Do I have to save my changes manually?
**A**: No, TeachStack will automatically save any changes you have made after a command is entered.
--------------------------------------------------------------------------------------------------------------------

## 10. Known issues

1. **When using multiple screens**, if you move the application to a secondary screen, and later switch to using only the primary screen, the GUI will open off-screen. The remedy is to delete the `preferences.json` file created by the application before running the application again.

--------------------------------------------------------------------------------------------------------------------

## 11. Command summary

| Action          | Format, Examples                                                                                                                    |
|-----------------|-------------------------------------------------------------------------------------------------------------------------------------|
| **Add**         | `add id/STUDENT_ID n/NAME e/EMAIL g/GRADE [gp/GROUP]...` <br> e.g., `add id/A0123459X n/James Doe e/e0123456@u.nus.edu g/A`         |
| **Delete**      | `delete STUDENT_ID`<br> e.g., `delete A0123456X`                                                                                    |
| **Edit**        | `edit STUDENT_ID [id/STUDENT_ID] [n/NAME] [e/EMAIL] [g/GRADE] [gp/GROUP_NAME]...` <br> e.g.,`edit A0123466C g/A+`                   |
| **View**        | `view STUDENT_ID`<br> e.g., `view A0123466D`                                                                                        |
| **Group**       | `group gp/GROUP_NAME id/STUDENT_ID_1 [id/STUDENT_ID_2] ...` <br> e.g., `group gp/Group 1 id/A1234567R, id/A2345678R`                |
| **Random Group** | `random NUMBER_OF_GROUPS gp/GROUP_NAME` <br> e.g., `random 3 gp/Random Group`                                                       |
| **Weak**        | `setweak g/GRADE` <br> e.g., `setweak g/B`                                                                                          |
| **Summary**     | e.g., `summary` <br>                                                                                                                |
| **Archive**     | `archive STUDENT_ID` <br> e.g., `archive A0123459X`                                                                                 |
| **Unarchive**   | `unarchived STUDENT_ID` <br> e.g., `unarchived A0123459X`                                                                           |
| **EditArchive** | `edit_archived STUDENT_ID [id/STUDENT_ID] [n/NAME] [e/EMAIL] [g/GRADE] [gp/GROUP_NAME]...` <br> e.g., `edit_archived A0123459X g/B` |
| **DeleteArchive** | `delete_archived STUDENT_ID` <br> e.g., `delete_archived A0123459X`                                                                 |
| **ClearArchive** | `clear_archived`                                                                                                                    |
| **Help**        | `help`                                                                                                                              |
| **Clear**       | `clear`                                                                                                                             |
| **Exit**        | `exit`                                                                                                                              |
  
