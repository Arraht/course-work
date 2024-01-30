package program.methods.calculation;

import program.object.employees.Employee;

import java.text.NumberFormat;

public class CalculationCost {
    public static void printCalculationCost(Employee[] employees) {
        int sumCost = 0;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        for (Employee employee : employees) {
            sumCost += employee.getSalary();
        }
        System.out.println("Сумма всех затрат в месяц на зарплату сотсавила " + numberFormat.format(sumCost));
    }
}
