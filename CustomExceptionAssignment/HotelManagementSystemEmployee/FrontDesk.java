package CustomExceptionAssignment.HotelManagementSystemEmployee;

public class FrontDesk extends Employee{
    public FrontDesk(int employeeID, String name, String poisition) {
        super(employeeID, name, poisition);
    }

    public FrontDesk(int employeeID, String name, String category, int taskCompletionRate, String performance) {
        super(employeeID, name, category, taskCompletionRate, performance);
    }

    public void checkInGuests(){
        System.out.println("Guest Check In ");
    }
}
