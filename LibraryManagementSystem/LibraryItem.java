package LibraryManagementSystem;

public class LibraryItem {
    private String title;
    private int itemID;
    LibraryItem(String title,int itemID){
        this.title=title;
        this.itemID=itemID;
    }

    public String getTitle() {
        return title;
    }

    public int getItemID() {
        return itemID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public void displayInfo(){
        System.out.println(title+" is a "+getClass()+" with ID: "+itemID);

    }
}
