package program.methods.calculation;

import program.employees.Employee;

import java.text.NumberFormat;

public class CalculationCostAverageValue {
    public static void printCalculationCostAverageValue(Employee[] employees) {
        float sumCostAverageValue = 0;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        for (Employee employee : employees) {
            sumCostAverageValue = (sumCostAverageValue + employee.getSalary());
        }
        sumCostAverageValue = sumCostAverageValue / employees.length;
        System.out.println("Среднее значение трат на зарплату в месяц = " +
                numberFormat.format(sumCostAverageValue));
    }
}