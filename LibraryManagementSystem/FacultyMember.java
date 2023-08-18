package LibraryManagementSystem;

 public class FacultyMember extends LibraryMember implements Reservable{

        public FacultyMember(int memberID, String name) {
            super(memberID, name);
        }

        @Override
        void borrowItem(LibraryItem item) {
            System.out.println(getClass()+" of "+getName()+" borrow an item "+item+" with memberID "+getMemberID());
        }
        public void reserveItem(LibraryItem item){
            System.out.println(getClass()+" of "+getName()+" reserve  an item "+item+" with memberID "+getMemberID());
        };
    }