package program.methods.print.fullname;

import program.employees.Employee;

public class PrintFulName {
    public static void printFulName(Employee[] employees) {
        System.out.println();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullName());
        }
    }
}