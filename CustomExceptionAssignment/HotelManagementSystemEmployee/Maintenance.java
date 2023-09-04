package CustomExceptionAssignment.HotelManagementSystemEmployee;

public class Maintenance extends Employee{
    public Maintenance(int employeeID, String name, String poisition) {
        super(employeeID, name, poisition);
    }
    public Maintenance(int employeeID, String name, String category, int taskCompletionRate, String performance) {
        super(employeeID, name, category, taskCompletionRate, performance);
    }

    public void help(){
        System.out.println("For any query contact...");
    }
}
