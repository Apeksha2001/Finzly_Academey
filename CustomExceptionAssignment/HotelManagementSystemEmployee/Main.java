package CustomExceptionAssignment.HotelManagementSystemEmployee;

public class Main {
    public static void main(String[] args) {
        EmployeeManagement employeeManagement = new EmployeeManagement();

        try {
            FrontDesk frontDeskEmployee = new FrontDesk(1,"ram","FrontDesk");
            Housekeeping housekeepingEmployee = new Housekeeping(2, "Sham","Housekeeping");
           KitchenStaff kitchenStaffEmployee = new KitchenStaff(3, "Riya","KitchenStaff",100,"Excellent");
           Maintenance maintenanceEmployee = new Maintenance(4, "Siya","Maintenance");

            employeeManagement.hireEmployee(frontDeskEmployee);
            employeeManagement.hireEmployee(housekeepingEmployee);
           employeeManagement.hireEmployee(kitchenStaffEmployee);
            employeeManagement.hireEmployee(maintenanceEmployee);

            employeeManagement.assignTask("Customer check-in", "FrontDesk");
            employeeManagement.assignTask("Room cleaning", "Housekeeping");
            employeeManagement.assignTask("Prepare meals", "KitchenStaff");
            employeeManagement.assignTask("Repair plumbing", "Maintenance");

            employeeManagement.updateEmployeeDetails(1, "John Smith");
            employeeManagement.fireEmployee(2);

            employeeManagement.generateEmployeePerformanceReport();
            employeeManagement.generateTaskCompletionReport();

        } catch (DuplicateEmployeeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidTaskException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}