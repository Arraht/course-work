package main;

import program.objects.employees.Employee;

import static program.methods.list.AddEmployees.addEmployees;
import static program.methods.calculation.CalculationCost.calculationCost;
import static program.methods.search.min.SearchMinSalary.searchMinSalary;
import static program.methods.search.max.SearchMaxSalary.searchMaxSalary;
import static program.methods.calculation.CalculationCostAverageValue.calculationCostAverageValue;
import static program.methods.print.PrintFulName.printFulName;


public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        addEmployees(employees);
        calculationCost(employees);
        searchMinSalary(employees);
        searchMaxSalary(employees);
        calculationCostAverageValue(employees);
        printFulName(employees);
    }
}