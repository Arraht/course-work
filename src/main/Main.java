package main;

import program.employees.Employee;

import static launch.Launch.launch;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        launch(employees);
    }
}