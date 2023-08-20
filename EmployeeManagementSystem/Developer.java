package EmployeeManagementSystem;

public class Developer extends Employee{
    private String programmingLanguage;

    public String getProgrammingLanguage(){
        return programmingLanguage;
    }
    public void setProgrammingLanguage(String programmingLanguage){
        this.programmingLanguage=programmingLanguage;
    }

    public void displayDeveloperDetails(){
        System.out.println("...DEVELOPER DETAILS...");
        System.out.println("Developer name: "+getName());
        System.out.println("Developer ID: "+getId());
        System.out.println("Programming Language: "+getProgrammingLanguage());
    }
}
