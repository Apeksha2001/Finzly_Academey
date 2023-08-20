package EmployeeManagementSystem;

public class Manager extends Employee{

    private String department;
    public String getDepartment(){
        return department;

    }
    public void setDepartment(String department){
        this.department=department;
    }

    public void displayManagerDetails(){
        System.out.println("...MANAGER DETAILS...");
        System.out.println("Manager name: "+getName());
        System.out.println("Manager ID: "+getId());
        System.out.println("Department: "+getDepartment());
    }

}
