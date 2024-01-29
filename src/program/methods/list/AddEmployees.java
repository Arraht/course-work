package program.methods.list;

import program.object.employees.Employee;
import program.object.counter.Counter;


public class AddEmployees {
    public static void addEmployees(Employee[] employees, Counter counter, int id) {
        String firstName = "";
        String middleName = "";
        String lustName = "";
        int department = 1;
        int salary = 0;
        Employee employee;
        for (int i = 0; i < employees.length; i++) {
            switch (i) {
                case 0:
                    firstName = "Маргарита";
                    middleName = "Григорьева";
                    lustName = "Дмитриевна";
                    department = 5;
                    salary = 57820;
                    id = counter.getId();
                    break;
                case 1:
                    firstName = "Владимир";
                    middleName = "Давидович";
                    lustName = "Карташов";
                    department = 4;
                    salary = 35124;
                    id = counter.getId();
                    break;
                case 2:
                    firstName = "Арсений";
                    middleName = "Никитич";
                    lustName = "Иванов";
                    department = 5;
                    salary = 65482;
                    id = counter.getId();
                    break;
                case 3:
                    firstName = "Софья";
                    middleName = "Владимировна";
                    lustName = "Седова";
                    department = 3;
                    salary = 32579;
                    id = counter.getId();
                    break;
                case 4:
                    firstName = "Аврора";
                    middleName = "Антоновна";
                    lustName = "Ершова";
                    department = 1;
                    salary = 65880;
                    id = counter.getId();
                    break;
                case 5:
                    firstName = "Александра";
                    middleName = "Дмитриевна";
                    lustName = "Ларионова";
                    department = 3;
                    salary = 75850;
                    id = counter.getId();
                    break;
                case 6:
                    firstName = "Максим";
                    middleName = "Григорьевич";
                    lustName = "Коровин";
                    department = 2;
                    salary = 40850;
                    id = counter.getId();
                    break;
                case 7:
                    firstName = "Анна";
                    middleName = "Денисовна";
                    lustName = "Кузьмина";
                    department = 1;
                    salary = 95000;
                    id = counter.getId();
                    break;
                case 8:
                    firstName = "Полина";
                    middleName = "Егоровна";
                    lustName = "Селезнева";
                    department = 5;
                    salary = 50000;
                    id = counter.getId();
                    break;
                case 9:
                    firstName = "Милана";
                    middleName = "Данииловна";
                    lustName = "Богданова";
                    department = 3;
                    salary = 45000;
                    id = counter.getId();
                    break;
            }
            employee = new Employee(firstName, middleName, lustName, department, salary, id);
            employees[i] = employee;
        }
    }
}