package CustomExceptionAssignment.HotelManagementSystemEmployee;

public class Housekeeping extends Employee{
    public Housekeeping(int employeeID, String name, String poisition) {
        super(employeeID, name, poisition);
    }
    public Housekeeping(int employeeID, String name, String category, int taskCompletionRate, String performance) {
        super(employeeID, name, category, taskCompletionRate, performance);
    }
    public void cleanRoom(){
        System.out.println("Room Cleaning Done");
    }
}
