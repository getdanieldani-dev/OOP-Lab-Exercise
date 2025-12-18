/**
 * LAB 7: Exception Handling
 * MEMBER - UPDATED WITH EXCEPTIONS
 * 
 * TODO: Update methods to throw exceptions
 */

public class Member {
    public String name;
    public int id;
    public int borrowedBookCount;
    
    public static final int BORROW_LIMIT = 3;
    
    Member(String name, int id){
        this.name = name;
        this.id = id;
        this.borrowedBookCount = 0;
    }
    
    public void displayInfo(){
        System.out.println("Member: "+ this.name+ " (ID: " + this.id +") | Borrowed Books: " + this.borrowedBookCount);
    }
    
    
    public void borrowItem(LibraryItem l){
        // Todo: throw an exception when a member tries to borrow an item above the borrow limit
        if(l.borrowItem()){
            this.borrowedBookCount++;
            System.out.println(this.name+" successfully borrowed "+l.title+"!");
        }
        else{
            System.out.println(this.name + " Sorry Cannot borrow "+ l.title);
        }
    }
    
    public void returnItem(LibraryItem i){
        i.returnItem();
        this.borrowedBookCount--;
        System.out.println(this.name+" returned "+i.title+"!");
    }
    
    
}
