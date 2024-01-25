package main;

import program.employees.Employee;

import static program.methods.list.AddEmployees.addEmployees;
import static program.methods.calculation.CalculationCost.calculationCost;
import static program.methods.search.min.SearchMinSalary.searchMinSalary;
import static program.methods.search.max.SearchMaxSalary.searchMaxSalary;
import static program.methods.calculation.CalculationCostAverageValue.calculationCostAverageValue;
import static program.methods.print.PrintFulName.printFulName;


public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        String firstName = "";
        String middleName = "";
        String lustName = "";
        int department = 1;
        int salary = 0;
        addEmployees(employees, firstName, middleName, lustName, department, salary);
        calculationCost(employees);
        searchMinSalary(employees);
        searchMaxSalary(employees);
        calculationCostAverageValue(employees);
        System.out.println();
        printFulName(employees);
    }
}