package CustomExceptionAssignment.HotelManagementSystemEmployee;

public class KitchenStaff extends Employee{
    public KitchenStaff(int employeeID, String name, String poisition) {
        super(employeeID, name, poisition);
    }

    public KitchenStaff(int employeeID, String name, String category, int taskCompletionRate, String performance) {
        super(employeeID, name, category, taskCompletionRate, performance);
    }

    public void foodOrder(){
        System.out.println("Ordered food ready to serve");
    }
}
