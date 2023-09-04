package CustomExceptionAssignment.HotelManagementSystemEmployee;


public class Employee {
    private int employeeID;
    private String name;
    private String category;

    private int taskCompletionRate;
    private String performance;

    public Employee(int employeeID, String name, String category) {
        this.employeeID = employeeID;
        this.name = name;
        this.category = category;
    }

    public Employee(int employeeID, String name, String category,int taskCompletionRate,String performance) {
        this.employeeID = employeeID;
        this.name = name;
        this.category = category;
        this.taskCompletionRate = taskCompletionRate;
        this.performance = performance;
    }


    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getTaskCompletionRate() {
        return taskCompletionRate;
    }

    public String getPerformance() {
        return performance;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setTaskCompletionRate(int taskCompletionRate) {
        this.taskCompletionRate = taskCompletionRate;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "employeeID=" + employeeID +
//                ", name='" + name + '\'' +
//                ", category='" + category + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", taskCompletionRate=" + taskCompletionRate +
                ", performance='" + performance + '\'' +
                '}';
    }
}
