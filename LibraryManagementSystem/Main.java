package LibraryManagementSystem;
public class Main {
    public static void main(String args[]){
        Book b=new Book("Book",101,"Apeksha");
        b.displayInfo();


        DVD d=new DVD("DVD",102,10);
        d.displayInfo();

        StudentMember studentMember=new StudentMember(444,"Adhya");
        FacultyMember facultyMember =new FacultyMember(555,"Sagar Sir");

        LibraryItem i1=b;
        LibraryItem i2=d;


        studentMember.borrowItem(i1);
        facultyMember.borrowItem(i2);
        studentMember.reserveItem(i2);
        facultyMember.reserveItem(i1);

    }

    // LibraryMember studentMember=new LibraryMember() ;
}