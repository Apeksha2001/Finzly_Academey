package CustomExceptionAssignment.HotelManagementSystemEmployee;

import java.util.*;

public class EmployeeManagement {
    private List<Employee> employees=new ArrayList<>();

    public void hireEmployee(Employee employee) throws DuplicateEmployeeException{
        if(employeeExists(employee)){
            throw new DuplicateEmployeeException("Employee with ID " + employee.getEmployeeID() + " already exists.");

        }
        employees.add(employee);
    }

    private boolean employeeExists(Employee employee){
        for(Employee e: employees){
            if(e.getEmployeeID()==employee.getEmployeeID()){
                return true;
            }
        }
        return false;
    }

    public void fireEmployee(int employeeID){
        for(Employee employee:employees){
            if(employee.getEmployeeID()==employeeID){
                employees.remove(employee);
                return;
            }
        }
        System.out.println("Employee with ID " + employeeID + " not found.");

    }

    public void assignTask(String task, String category) throws InvalidTaskException {
        if (!Arrays.asList("FrontDesk", "Housekeeping", "KitchenStaff", "Maintenance").contains(category)) {
            throw new InvalidTaskException("Invalid category: " + category);
        }

        List<Employee> availableEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getCategory().equals(category)) {
                availableEmployees.add(employee);
            }
        }

        if (availableEmployees.isEmpty()) {
            throw new InvalidTaskException("No employees available in the " + category + " category.");
        } else {
            int randomIndex = new Random().nextInt(availableEmployees.size());
            Employee assignedEmployee = availableEmployees.get(randomIndex);
            System.out.println("Task '" + task + "' assigned to " + assignedEmployee.getName() + " in the " + category + " category.");
        }
    }

    public void updateEmployeeDetails(int employeeID,String newName){
        for(Employee employee:employees){
            if(employee.getEmployeeID()==employeeID){
                employee.setName(newName);
                System.out.println("Employee details updated for employee "+employeeID);
                return;
            }
        }
        System.out.println("Employee with ID " + employeeID + " not found.");

    }

    public void generateEmployeePerformanceReport() {
        System.out.println("Employee Performance Report:");
        System.out.println("----------------------------");
        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.getEmployeeID());
            System.out.println("Employee Name: " + employee.getName());
            System.out.println("Category: " + employee.getCategory());
            System.out.println("Performance: " + employee.getPerformance());
            System.out.println("-----------------------------");
        }
    }

    public void generateTaskCompletionReport() {
        System.out.println("Task Completion Report:");
        System.out.println("-----------------------");
        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.getEmployeeID());
            System.out.println("Employee Name: " + employee.getName());
            System.out.println("Category: " + employee.getCategory());
            System.out.println("Task Completion Rate: " + employee.getTaskCompletionRate() + "%");
            System.out.println("-----------------------------");
        }
    }


}
