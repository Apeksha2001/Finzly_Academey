package Collection.EmployeeManagementSystem;


import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer,Employee>employees=new HashMap<>();
        Scanner scanner=new Scanner(System.in);

        int choice;
        do {
            System.out.println("--EMPLOYEE DETAILS--");
            System.out.println("1. Add Employee Details");
            System.out.println("2.View Employee Details");
            System.out.println("3.Search Employee Details");
            System.out.println("4.List All Employees");
            System.out.println("5.Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("--Add details--");
                    System.out.println("Enter Employee ID: ");
                    int employeeID = scanner.nextInt();
                    System.out.println("Enter Employee Name: ");
                    String employeeName = scanner.next();
                    System.out.println("Enter Employee Age: ");
                    int employeeAge= scanner.nextInt();

                    Employee addEmployee = new Employee(employeeID,employeeName,employeeAge);
                    employees.put(employeeID, addEmployee);
                    System.out.println("Employee Details Add Successfully");

                    break;

                case 2:
                    System.out.println("--View Employee Details");
                    System.out.println("Enter Employee ID: ");
                    employeeID = scanner.nextInt();

                    Employee viewEmployee= employees.get(employeeID);
                    if (viewEmployee != null) {
                        System.out.println(viewEmployee);
                    } else {
                        System.out.println("Invalid Employee ID");
                    }
                    break;

                case 3:
                    System.out.println("--Search Employee--");
                    System.out.println("Enter Employee ID: ");
                    employeeID = scanner.nextInt();

                    Employee searchEmployee= employees.get(employeeID);
                    if (searchEmployee != null) {
                        System.out.println(searchEmployee);
                    } else {
                        System.out.println("Invalid Employee ID");
                    }
                    break;

                case 4:
                    System.out.println("--Display All Employee--");
                    for (Employee allEmployee : employees.values()) {
                        System.out.println(allEmployee);
                    }
                    break;

                case 5:
                    System.out.println("Exit");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");

            }
        } while (choice != 5) ;

    }
}





