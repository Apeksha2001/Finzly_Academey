package Collection.SchoolManagementSystem;

public class Student extends School{
     int studentId;

    public Student(String name, int age,int studentId) {
        super(name, age);
        this.studentId=studentId;
    }

    @Override
    public String toString() {
        return super.toString()+" ,Student ID: "+studentId;

    }
}
