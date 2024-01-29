package main;

import program.object.counter.Counter;
import program.object.employees.Employee;

import static launch.Launch.launch;

public class Main {
    public static void main(String[] args) {
        int id = 0;
        Employee[] employees = new Employee[10];
        Counter counter = new Counter(id);
        launch(employees, counter, id);
    }
}