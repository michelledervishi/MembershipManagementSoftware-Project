# MembershipManagementSoftware-Project


INSTRUCTIONS
------------
Compile and run main.java
Login as 'treasurer', 'coach', or 'member' with the password: 'password'. Press cancel to clear the fields.
Each username will open its respective mode.
Logout will return to the login screen for switching between modes.

Treasurer mode:
Select a month from the dropdown in Debt Log.
Select an expense type.
Enter an amount of money (decimals are allowed).
Enter the due date of the expense for the selected month.
Press submit to log the expense and view the total debt for the selected month.
The cancel button will clear the text fields.

Coach mode:
View registered members on the right hand side with the format: FIRSTNAME, LASTNAME, PHONENUMBER, ADDRESS, BALANCE, TIMES PAID/NOTPAID
With provided test list you can sort members via frequency and times they paid/not paid
You can apply respective discounts and fees to each member based on the times the paid/not paid and if they paid consecutively
You can add members by entering the fields in add/remove section
By typing in the members first and last name, you can remove them from the registered members list
By typing in the recipient's first and last name, you can send them messages that will be stored in "membersmsgs.txt"
Coach's Inbox tab is only UI component currently.

Member mode only has a UI component.

CONTENTS OF THIS FILE
---------------------

 * Introduction
 * Requirements
 * Backlog.docx
 * Testplan.docx
 * Software
 

INTRODUCTION
---------------------

The following assignment is completed by: 

Nichalus Tofflemire-Varela
Jimmy Tran
Zack Calderwood
Judel Villardo
Michelle Dervishi

The Membership Management Software is created to provide a user friendly UI for most users
participing or working in a club. For the first Iteration, a report backlog and testplan was
created to track the completed tasks and what needs to be finished. 

*NOTE
Login as member           Username: member     Password: password
Login as coach            Username: coach      Password: password
Login as treasurer        Username: treasurer  Password: password

REQUIREMENTS
---------------------

The following components will be used:
Eclipse
Eclipse WindowBuilder
Java 9

Please update according to these requirements.
I highly recommending downloading the git integration for Eclipse.


BACKLOG.DOCX
------------

This document will provide a report on what user stories have been completed and the actual
effort it took to complete the task. The effort was recorded for each user story. A burndown chart and team velocity
chart was provided as well.


TESTPLAN.DOCX
------------

This archive contains a test plan of tests for the following operations:
1.	GUI
2.	Login System
3.	Managing Members 
4.	Accounting 
5.	Messaging System 
6.	Scheduling 

Test case ID, Purpose, Steps, Expected Results, and Actual Results are all containted in this document.


SOFTWARE
------------

This software is intended to provided a user friendly UI for mananging and accessing clubs.
The software allows three types of users to login, members, coach, and treasurer.Members
are able to pay for classes and see messages sent by coaches.Members can pay for classes
and will be notified if they need to. Coaches can add/remove members, and send out messages
to the current members in the club. The treasurer can schedule coaches and view the list
of members. Coaches are able to view the list of members as well. Members are automatically
charged for missed payments, and members with good attendance will be elligible to get 
a discount. The treasurer has access to all finances.

