package Collection.SchoolManagementSystem;

abstract public class School {

    protected String name;
    protected int age;

    public School( String name, int age) {

        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
