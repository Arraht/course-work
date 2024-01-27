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
        for (Employee value : employees) {
            if (value.getSalary() > maxSalary) {
                employee = value;
            }
            maxSalary = employee.getSalary();
            employeesName = employee.getFullName();
        }
        System.out.println("Максимальная зарплата у сотрудника " + employeesName + " в размере " +
                numberFormat.format(maxSalary));
    }
}
