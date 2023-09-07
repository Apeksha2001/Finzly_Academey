package Hibernate.Hibernate_CRUD;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    private int EmployeeID;
    private String employeeName;
    private String Salary;

    public Employee() {
    }

    public Employee(int employeeID, String employeeName, String Salary) {
        EmployeeID = employeeID;
        this.employeeName = employeeName;
        this.Salary = Salary;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        this.Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeID=" + EmployeeID +
                ", employeeName='" + employeeName + '\'' +
                ", Salary='" + Salary + '\'' +
                '}';
    }
}
