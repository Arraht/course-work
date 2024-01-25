package program.methods.print;

import program.objects.employees.Employee;

public class PrintFulName {
    public static void printFulName(Employee[] employees) {
        System.out.println();
        Employee employee;
        for (int i = 0; i < employees.length; i++) {
            employee = employees[i];
            System.out.println(employee.getFullName());
        }
    }
}