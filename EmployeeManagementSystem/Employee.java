package EmployeeManagementSystem;

public class Employee {
    private int id;
    private String name;

    public Employee(){
        this.id=EmployeeIdGenerator.generateId();
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class EmployeeIdGenerator {
    private static int nextId = 1;

    public static int generateId() {
        return nextId++;
    }
}