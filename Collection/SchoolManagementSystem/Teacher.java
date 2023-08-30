package Collection.SchoolManagementSystem;

public class Teacher extends School{
     int teacherId;


    public Teacher(String name, int age,int teacherId) {
        super(name, age);
        this.teacherId=teacherId;
    }

    @Override
    public String toString(){
        return super.toString() +" , Teacher ID: "+teacherId;
    }
}
