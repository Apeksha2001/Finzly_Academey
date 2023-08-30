package Collection.HospitalManagementSystem;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Patient> patients = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("------Hospital--------");
            System.out.println("1.Add Patient");
            System.out.println("2.View Patient Details");
            System.out.println("3.Search Patient");
            System.out.println("4.List All Patient");
            System.out.println("5.Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("--Add Details--");
                    System.out.println("Enter Patient Name: ");
                    String patientName = scanner.next();

                    System.out.println("Enter Patient Age: ");
                    int patientAge = scanner.nextInt();

                    System.out.println("Enter Patient ID: ");
                    int  patientId = scanner.nextInt();

                    System.out.println("Enter Disease: ");
                    String disease=scanner.next();


                    Patient patient1 = new Patient(patientName,patientAge,patientId,disease);
                    patients.put(patientId,patient1);
                    System.out.println("Patient Add Successfully");
                    System.out.println("Patient Details: "+patient1);

                    break;

                case 2:
                    System.out.println("--View Patient Details--");
                    System.out.println("Enter Patient ID: ");
                    int viewID= scanner.nextInt();

                    Patient viewPatient=patients.get(viewID);
                    if(viewPatient != null){
                        System.out.println(viewPatient);
                    }
                    else{
                        System.out.println("Invalid Patient ID");
                    }
                    break;


                case 3:
                    System.out.println("--Search Patient--");
                    System.out.println("Enter Patient ID: ");
                    int patientID= scanner.nextInt();

                    Patient searchPatient=patients.get(patientID);
                    if(searchPatient != null){
                        System.out.println(searchPatient);
                    }
                    else{
                        System.out.println("Invalid Patient ID");
                    }
                    break;

                case 4:
                    System.out.println("--List Of All Patient--");
                    for(Patient allPatient:patients.values()){
                        System.out.println(allPatient);
                    }
                    break;

                case 5:
                    System.out.println("Exit");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");

            }

        }while (choice!=5);
    }
}



