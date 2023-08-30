package Collection.ProjectManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        HashMap<Integer, Project> projects = new HashMap<>();
        ArrayList<String> teamMembers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("--PROJECT DETAILS--");
            System.out.println("1. Add Project Details");
            System.out.println("2.View Project Details");
            System.out.println("3.Search Project Details");
            System.out.println("4.List All Project");
            System.out.println("5.Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("--Add details--");
                    System.out.println("Enter Project ID: ");
                    int projectID = scanner.nextInt();
                    System.out.println("Enter Project Name: ");
                    String projectName = scanner.next();
                    System.out.println("Enter Description: ");
                    String description = scanner.next();

                    while (true) {
                        System.out.println("Enter Team Members (Enter done at time of finish) ");
                        String teamMember = scanner.next();

                        if (teamMember.equalsIgnoreCase("done")) {
                            break;

                        }
                        teamMembers.add(teamMember);
                    }
                    Project addProject = new Project(projectID, projectName, description, teamMembers);
                    projects.put(projectID, addProject);
                    System.out.println("Project Details Add Successfully");

                    break;

                case 2:
                    System.out.println("--View Project Details");
                    System.out.println("Enter Project ID: ");
                    projectID = scanner.nextInt();

                    Project viewProject = projects.get(projectID);
                    if (viewProject != null) {
                        System.out.println(viewProject);
                    } else {
                        System.out.println("Invalid Project ID");
                    }
                    break;

                case 3:
                    System.out.println("--Search Project--");
                    System.out.println("Enter Project ID: ");
                    projectID = scanner.nextInt();

                    Project searchProject = projects.get(projectID);
                    if (searchProject != null) {
                        System.out.println(searchProject);
                    } else {
                        System.out.println("Invalid Project ID");
                    }
                    break;

                case 4:
                    System.out.println("--Display All Projects--");
                    for (Project allProjects : projects.values()) {
                        System.out.println(allProjects);
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


