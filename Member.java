/**
 * LAB 8: GUI with Swing - STUDENT EXERCISE
 * 
 * TODO: Students complete this simplified GUI
 * 
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
    
    
    public String borrowItem(LibraryItem l){
        if(l.borrowItem()){
            this.borrowedBookCount++;
            return this.name+" successfully borrowed "+l.title+"!";
             
        }
        else{
            return this.name + " Sorry Cannot borrow "+ l.title;
        }
    }
    
    public String returnItem(LibraryItem i){
        i.returnItem();
        this.borrowedBookCount--;
        return this.name+" returned "+i.title+"!";
    }
    
    
}
