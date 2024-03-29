package program.object.employees;


import java.text.NumberFormat;

public class Employee {
    private String firstName;
    private String middleName;
    private String lustName;
    private String fullName;
    private int department;
    private int salary;
    private int id;


    public Employee(String firstName, String middleName, String lustName, int department, int salary, int id) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lustName = lustName;
        this.fullName = lustName + " " + firstName + " " + middleName;
        this.id = id;
        if (department > 0 && department <= 5) {
            this.department = department;
        } else {
            throw new RuntimeException("Отделов всего 5");
        }
        this.salary = salary;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        this.fullName = this.lustName + " " + this.firstName + " " + this.middleName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
        this.fullName = this.lustName + " " + this.firstName + " " + this.middleName;
    }

    public String getLustName() {
        return lustName;
    }

    public void setLustName(String lustName) {
        this.lustName = lustName;
        this.fullName = this.lustName + " " + this.firstName + " " + this.middleName;
    }

    public String getFullName() {
        fullName = lustName + " " + firstName + " " + middleName;
        return fullName;
    }

    public void setFullName(String lustName, String firstName, String middleName) {
        this.lustName = lustName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.fullName = lustName + " " + firstName + " " + middleName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        return "Ф.И.О сотрудника " + this.fullName + ", отдел сотрудника " + this.department + ", зарплата сотрудника" +
                " равна " + numberFormat.format(this.salary) + ", ID сотрудника = " + this.id;
    }
}