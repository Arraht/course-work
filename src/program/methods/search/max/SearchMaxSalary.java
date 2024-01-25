package program.methods.search.max;

import program.employees.Employee;

import java.text.NumberFormat;

public class SearchMaxSalary {
    public static void searchMaxSalary(Employee[] employees) {
        Employee employee;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        employee = employees[0];
        String employeesName = "";
        int maxSalary = employee.getSalary();
        for (int i = 0; i < employees.length; i++) {
            employee = employees[i];
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                employeesName = employee.getFullName();
            }
        }
        System.out.println("Максимальная зарплата у сотрудника " + employeesName + " в размере " +
                numberFormat.format(maxSalary));
    }
}
