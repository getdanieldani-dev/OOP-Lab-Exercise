/**
 * LAB 6: Polymorphism
 * MAIN TEST CLASS - STUDENT TODO
 * 
 * TODO: Students demonstrate polymorphism in this lab
 */

public class Magazine extends LibraryItem {
    
    private String publisher;
    private int issueNumber;
    private String category;
    private int timesBorrowed;
    
    public Magazine(String title, String publisher, int issueNumber, String category){
        super(title);
        this.publisher = publisher;
        this.issueNumber = issueNumber;
        this.category = category;
        this.timesBorrowed = 0;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("=== Magazine ===");
        // Call parent's displayInfo to show common properties
        super.displayInfo();
        // Add book-specific information
        System.out.println("Publisher: " + publisher);
        System.out.println("Issue Number: " + issueNumber);
        System.out.println("Category: " + category);
        System.out.println("Times Borrowed: " + timesBorrowed);
    }
    
    @Override
    public boolean borrowItem(){
        if(timesBorrowed >= 1){
            System.out.println("Cannot borrow - already borrowed before");
            return false;
        }
        else{
            boolean canBorrow = super.borrowItem();
            if(canBorrow){
                timesBorrowed++;
            }
            return canBorrow;
        }
    }
    
    
}
