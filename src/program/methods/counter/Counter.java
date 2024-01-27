package program.methods.counter;

import program.employees.Employee;

public class Counter {
    public static void createCount(Employee[] employees) {
        int id = 0;
        for (Employee employee : employees) {
            id += 1;
            employee.setId(id);
        }
    }
}