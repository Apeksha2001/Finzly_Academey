package LibraryManagementSystem;

public class Book extends LibraryItem {

    private String author;
    Book(String title, int itemID,String author) {
        super(title, itemID);
        this.author =author;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    @Override
    public void displayInfo(){
        System.out.println(getTitle()+" is a "+getClass()+" with ID: "+getItemID()+" and author name is "+ getAuthor());

    }


}