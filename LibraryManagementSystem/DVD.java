package LibraryManagementSystem;

public class DVD extends LibraryItem{

    private int duration;
    DVD(String title, int itemID,int duration) {
        super(title, itemID);
        this.duration=duration;
    }
    public int getDuration(){
        return duration;
    }
    public void setDuration(int duration){
        this.duration=duration;
    }
    @Override
    public void displayInfo(){
        System.out.println(getTitle()+" is a "+getClass()+" with ID: "+getItemID()+" and have duration  "+getDuration()+" min");

    }

}

