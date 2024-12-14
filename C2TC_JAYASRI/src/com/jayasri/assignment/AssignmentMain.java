package com.jayasri.assignment;

import assignmentmain.Developer;
import assignmentmain.EmployeeUtilities;
import assignmentmain.Manager;
public class AssignmentMain {
public static void main(String[] args) {
Manager manager = new Manager("Jayasri", 001, "Marketing");
Developer developer = new Developer("Sri", 200, "Java");
EmployeeUtilities.printEmployeeDetails(manager);
EmployeeUtilities.printEmployeeDetails(developer);
}
}
