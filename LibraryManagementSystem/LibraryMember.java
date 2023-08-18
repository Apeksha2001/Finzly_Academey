package LibraryManagementSystem;

public abstract class LibraryMember {
    private int memberID;
    private String name;

    public LibraryMember(int memberID, String name) {
        this.memberID = memberID;
        this.name = name;
    }

    public int getMemberID() {
        return memberID;
    }

    public String getName() {
        return name;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void borrowItem(LibraryItem item);

}