package program.methods.calculation;

import program.objects.employees.Employee;

import java.text.NumberFormat;

public class CalculationCost {
    public static void calculationCost(Employee[] employees) {
        Employee employee;
        int sumCost = 0;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        for (int i = 0; i < employees.length; i++) {
            employee = employees[i];
            sumCost += employee.getSalary();
        }
        System.out.println("Сумма всех затрат в месяц на зарплату сотсавила " + numberFormat.format(sumCost));
    }
}
