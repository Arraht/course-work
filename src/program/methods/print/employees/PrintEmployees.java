package program.methods.print.employees;

import program.employees.Employee;

public class PrintEmployees {
    public static void printEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}