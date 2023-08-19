package StudentInformationSystem;

public class StudentMain {
    public static void main(String args[]){
        Student student1=new Student();
        Student student2=new Student("Gita",18);
        Student student3=new Student(15);



        student1.displayStudentInformation();
        student2.displayStudentInformation();
        student3.displayStudentInformation();

    }
}
