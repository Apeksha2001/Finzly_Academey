package Collection.EmployeeManagementSystem;

public class Employee {
    private int employeeId;
    private String name;
    private int age;


    public Employee(int employeeId,String name, int age) {
        this.employeeId=employeeId;
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
