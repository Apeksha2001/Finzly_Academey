/**Requirements:
1.Class Definition:Define a class named `Student` with the following attributes:
`name`: A string representing the student's name.
`age`: An integer representing the student's age.
`studentId`: A unique identifier for each student.
2.Constructors:
Implement the following constructors for the `Student` class:
A default constructor that initializes the student's name as "Unknown", age as 0, and assigns a unique student ID.
A parameterized constructor that accepts the student's name and age and assigns a unique student ID.
Overload the parameterized constructor to also accept the student's age.
**/

package StudentInformationSystem;

public class Student {
    String name;
    int age;
    static int Id=1;
    int studentId;

    Student(){
        this.name="Unknown";
        this.age=0;
        this.studentId=Id++;
    }

    Student(String name,int age){
        this.name=name;
        this.age=age;
        this.studentId=Id++;
    }

    Student(int age){
        this("Sita",age);

    }


    public void displayStudentInformation(){
        System.out.println("Student name: "+name+"  | Student age: "+age+"  | Student Id: "+studentId);
    }

}
