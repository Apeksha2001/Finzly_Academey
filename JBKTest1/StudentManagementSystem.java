package JBKTest1;
class Student {
    private int studentID;
    private String name;
    private static int totalStudents = 0; // Static variable to track the total number of students

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        totalStudents++; // Increment totalStudents when a new student is created
    }

    public void enrollStudent() {
        System.out.println("Enrolling student: " + name);
    }

    public void dropStudent() {
        System.out.println("Dropping student: " + name);
        totalStudents--; // Decrement totalStudents when a student is dropped
    }

    public static int getTotalStudents() {
        return totalStudents; // Static method to access the total number of students
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Sita");
        Student student2 = new Student(102, "Gita");

        student1.enrollStudent();
        student2.enrollStudent();

        System.out.println("Total students: " + Student.getTotalStudents());

        student2.dropStudent();

        System.out.println("Total students after dropping: " + Student.getTotalStudents());
    }
}

