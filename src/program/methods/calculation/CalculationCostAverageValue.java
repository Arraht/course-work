package program.methods.calculation;

import program.employees.Employee;

import java.text.NumberFormat;

public class CalculationCostAverageValue {
    public static void calculationCostAverageValue(Employee[] employees, Employee employee) {
        float sumCostAverageValue = 0;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        for (int i = 0; i < employees.length; i++) {
            employee = employees[i];
            sumCostAverageValue = (sumCostAverageValue + employee.getSalary());
        }
        sumCostAverageValue = sumCostAverageValue / employees.length;
        System.out.println("Среднее значение трат на зарплату в месяц = " +
                numberFormat.format(sumCostAverageValue));
    }
}
