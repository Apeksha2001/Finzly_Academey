package Collection.SchoolManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. Display Students");
            System.out.println("4. Display Teachers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String studentName = scanner.next();
                    System.out.print("Enter student age: ");
                    int studentAge = scanner.nextInt();
                    System.out.print("Enter student ID: ");
                    int studentId = scanner.nextInt();

                    students.add(new Student(studentName, studentAge, studentId));
                    break;

                case 2:
                    System.out.print("Enter teacher name: ");
                    String teacherName = scanner.next();
                    System.out.print("Enter teacher age: ");
                    int teacherAge = scanner.nextInt();
                    System.out.print("Enter employee ID: ");
                    int teacherId = scanner.nextInt();

                    teachers.add(new Teacher(teacherName, teacherAge, teacherId));
                    break;

                case 3:
                    System.out.println("--Display Student Details--");
                    for (Student student:students){
                        System.out.println(student);
                    }
                    break;

                case 4:
                    System.out.println("--Display Teachers Details--");
                    for (Teacher teacher:teachers){
                        System.out.println(teacher);
                    }
                    break;

                case 5:
                    System.out.println("Exit");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");


            }


        }while (choice !=5);
    }
}
