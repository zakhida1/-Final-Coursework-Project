# Task List Organizer(Java CRUD Console Application)
##Student Name: Nasiridinova Zakhida

## Project Title:
Java Console-Based User Management System (CRUD Application)

## Overview:
This project is a console-based application written in Java that performs basic CRUD operations like Create,Read,Update and Delete for managing user data.Users can interact with the system through a clear and simple command-line menu.All user data is saved in a text file, ensuring persistence across sessions
The application includes input validation (e.g., checking email format), basic error handling, and a report generation feature to summarize stored data. It also supports data import/export,allowing for backups or integration with other systems
This project demonstrates the fundamental principles of software development, including modular design, file handling, user input management and data validation.


## Project Goals:
Implement CRUD functionality using Java

Practice working with files (read/write)

Apply Object-Oriented Programming (OOP) principles

Validate user inputs ( non-empty fields,proper email format)

Handle errors gracefully (invalid inputs, file errors)

Generate summary reports (e.g., total users)

Support data import/export to/from files

Write clean,modular and well-structured code

Document the system clearly and professionally

## Features:
Create Task:Add a new task with title,description, due date, priority and status
View Tasks:Display a list of all saved tasks with their details
Update Task:Modify task attributes by selecting a task ID
Delete Task: Remove a task permanently using its ID
Search Task: Find tasks by keywords in the title or description
Filter Tasks:Filter tasks by status (e.g., "Pending", "Completed") or by due date
Generate Report: Generate a summary of tasks and view recent activity logs
Import/Export CSV: Load tasks from or save tasks to a .csv file
Input Validation: Validate input formats for dates and restrict empty/invalid fields
Exit with Logging: Exit the application safely and log the session's actions

## Running the Application:
1)Download or clone the project repository
2)Open a terminal/command prompt and navigate to the project folder
3)Compile the program using:
javac TaskOrganizer.java
4)Run the application with:
java TaskOrganizer

## Functions and Methods
1. createTask()
Prompts the user to enter task details (title, description, due date, priority, status)
Validates the due date format (YYYY-MM-DD) and ensures fields are not empty
2. viewTasks()
Displays all saved tasks with their ID, title, due date, and current status
3. updateTask()
Finds a task by ID and allows updates to any field
4. deleteTask()
Removes a task permanently based on user-selected ID
5. searchTasks()
Enables keyword search in title and description fields
6. filterTasks()
Allows filtering by status or due date range
7. generateReport()
Displays task summary (total,completed,pending) and session activity log
8. importTasksFromCSV() and exportTasksToCSV()
Loads or saves tasks from/to tasks.csv.
9. validateInput() helpers
Ensures date, priority and status values are valid before accepting input
10. exitApp()
Closes the app, logs the exit action and saves task data if needed

## File Format
All tasks are stored in a file named tasks.csv with the following format:
id,title,description,dueDate,priority,status
Example:
1,Finish Java project,Complete final coursework,2025-05-15,High,Pending
2,Buy groceries,Milk, eggs, bread,2025-05-10,Medium,Completed

## Test Cases
Test Case 1:Create Task with Valid Data
Input:
1  
Finish homework  
Complete all Java exercises  
2025-05-12  
High  
Pending  

Output:
Task successfully created!

Test Case 2: Create Task with Invalid Date Format
Input:
1  
Prepare slides  
Finish presentation deck  
12-05-2025  
2025-05-12  
Medium  
Pending  
Output:
Invalid date format. Use YYYY-MM-DD.

Test Case 3: View Tasks
Input:
2
Output:
ID: 1 | Title: Finish homework | Due: 2025-05-12 | Status: Pending

Test Case 4: Update Task
Input:
3  
1  
Update title: Finish final homework  
Update status: Completed  
Output:
Task updated successfully.

Test Case 5: Delete Task
Input:
4
1
Output:
Task deleted successfully.

Test Case 6: Search Task by Keyword
Input:
5  
Java  
Output:
Tasks containing 'Java':
ID: 2 | Title: Java exam prep

Test Case 7: Filter by Status
Input:
6  
Filter by: Status  
Value: Completed  
Output:
Filtered Tasks:
ID: 2 | Title: Buy groceries | Status: Completed

Test Case 8: Import Tasks
Input:
8  
(imports `tasks.csv`)
Output:
Tasks imported successfully.

Test Case 9: Export Tasks
Input:
9
Output:
Tasks exported to tasks.csv


Test Case 10: Generate Report
Input:
7
Output:
Total tasks: 5  
Completed: 3  
Pending: 2  
Activity Log:
- Created task...
- Deleted task...

✅ Test Case 11: Exit Application
Input:
0
Output:
Exiting Task Organizer List...
All changes saved.
Activity logged. Goodbye!


## IMPLEMENTATION DETAILS:

Language: Java
IDE: IntelliJ IDEA 
Storage:Local text/CSV files
Modules:TaskManager, FileHandler,CLI, Validator


## PRESENTATION

https://www.canva.com/design/DAGnCzEkCb0/94HWiZ52MPY4_gPwN5xEgw/edit?utm_content=DAGnCzEkCb0&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton
