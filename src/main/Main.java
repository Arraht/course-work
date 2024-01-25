package main;

import program.counter.Counter;
import program.employees.Employee;

import static program.methods.list.AddEmployees.addEmployees;
import static program.methods.calculation.CalculationCost.calculationCost;
import static program.methods.search.min.SearchMinSalary.searchMinSalary;
import static program.methods.search.max.SearchMaxSalary.searchMaxSalary;
import static program.methods.calculation.CalculationCostAverageValue.calculationCostAverageValue;
import static program.methods.print.PrintFulName.printFulName;


import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Counter count = new Counter();
        Employee[] employees = new Employee[10];
        String firstName = " ";
        String middleName = "";
        String lustName = "";
        int department = 1;
        int salary = 0;
        int id = count.getCount();
        Employee employee = new Employee(firstName, middleName, lustName, department, salary, id);
        addEmployees(employees, employee, firstName, middleName, lustName, department, salary, id);
        System.out.println(Arrays.toString(employees));
        calculationCost(employees, employee);
        searchMinSalary(employees, employee);
        searchMaxSalary(employees, employee);
        calculationCostAverageValue(employees, employee);
        System.out.println();
        printFulName(employees, employee);
    }
}