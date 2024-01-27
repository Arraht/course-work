package launch;

import program.employees.Employee;

import static program.methods.calculation.CalculationCost.printCalculationCost;
import static program.methods.calculation.CalculationCostAverageValue.printCalculationCostAverageValue;
import static program.methods.counter.Counter.createCount;
import static program.methods.list.AddEmployees.addEmployees;
import static program.methods.print.employees.PrintEmployees.printEmployees;
import static program.methods.print.fullname.PrintFulName.printFulName;
import static program.methods.search.max.SearchMaxSalary.searchMaxSalary;
import static program.methods.search.min.SearchMinSalary.searchMinSalary;

public class Launch {
    public static void launch(Employee[] employees) {
        addEmployees(employees);
        createCount(employees);
        printEmployees(employees);
        printCalculationCost(employees);
        searchMinSalary(employees);
        searchMaxSalary(employees);
        printCalculationCostAverageValue(employees);
        printFulName(employees);
    }
}