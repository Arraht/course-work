package program.methods.search.min;

import program.object.employees.Employee;

import java.text.NumberFormat;

public class SearchMinSalary {
    public static void searchMinSalary(Employee[] employees) {
        Employee employee;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        employee = employees[0];
        String employeesName = "";
        int minSalary = employee.getSalary();
        for (Employee value : employees) {
            if (value.getSalary() < minSalary) {
                employee = value;
            }
            minSalary = employee.getSalary();
            employeesName = employee.getFullName();
        }
        System.out.println("Минимальная зарплата у сотрудника " + employeesName + " в размере " +
                numberFormat.format(minSalary));
    }
}
