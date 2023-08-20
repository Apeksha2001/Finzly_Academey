package EmployeeManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String choice;

        do{
            System.out.println("Enter Manager Details");
            Manager manager=new Manager();

            System.out.print("Enter Name: ");
            manager.setName(sc.next());
            System.out.print("Enter Department: ");
            manager.setDepartment(sc.next());


            System.out.println();
            System.out.println("Enter Developer Details");
            Developer developer=new Developer();

            System.out.print("Enter Name: ");
            developer.setName(sc.next());
            System.out.print("Enter Programming Language: ");
            developer.setProgrammingLanguage(sc.next());
            System.out.println();

            manager.displayManagerDetails();
            System.out.println();
            developer.displayDeveloperDetails();
            System.out.println();
            System.out.println("Do you want to continue... ");
            choice=sc.next();
        }while (choice.charAt(0)=='Y'|| choice.charAt(0)=='y');



    }
}
