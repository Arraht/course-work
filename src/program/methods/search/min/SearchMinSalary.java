package program.methods.search.min;

import program.employees.Employee;

import java.text.NumberFormat;

public class SearchMinSalary {
    public static void searchMinSalary(Employee[] employees) {
        Employee employee;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        employee = employees[0];
        String employeesName = "";
        int minSalary = employee.getSalary();
        for (int i = 0; i < employees.length; i++) {
            employee = employees[i];
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                employeesName = employee.getFullName();
            }
        }
        System.out.println("Минимальная зарплата у сотрудника " + employeesName + " в размере " +
                numberFormat.format(minSalary));
    }
}
