package launch;

import program.object.employees.Employee;
import program.object.counter.Counter;

import static program.methods.calculation.CalculationCost.printCalculationCost;
import static program.methods.calculation.CalculationCostAverageValue.printCalculationCostAverageValue;
import static program.methods.list.AddEmployees.addEmployees;
import static program.methods.print.employees.PrintEmployees.printEmployees;
import static program.methods.print.fullname.PrintFulName.printFulName;
import static program.methods.search.max.SearchMaxSalary.searchMaxSalary;
import static program.methods.search.min.SearchMinSalary.searchMinSalary;


public class Launch {
    public static void launch(Employee[] employees, Counter counter, int id) {
        addEmployees(employees,counter, id);
        printEmployees(employees);
        printCalculationCost(employees);
        searchMinSalary(employees);
        searchMaxSalary(employees);
        printCalculationCostAverageValue(employees);
        printFulName(employees);
    }
}