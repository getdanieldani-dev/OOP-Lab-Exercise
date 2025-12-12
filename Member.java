/**
 * LAB 6: Polymorphism
 * MEMBER CLASS - BEFORE REFACTORING (BAD VERSION)
 * 
 * TODO: Students must refactor this class to use polymorphism
 * 
 * PROBLEM: This class has separate methods for each item type.
 * This violates the DRY principle and makes adding new item types difficult.
 */

public class Member {
    
    private String name;
    private int id;
    private int borrowedBookCount;
    
    Member(String name, int id){
        this.name = name;
        this.id = id;
        this.borrowedBookCount = 0;
    }
    
    public void displayInfo(){
        System.out.println("Member: "+ this.name+ " (ID: " + this.id +") | Borrowed Books: " + this.borrowedBookCount);
    }
    
    public void borrowBook(Book b){
        if(b.borrowItem()){
            this.borrowedBookCount++;
            System.out.println(this.name+" successfully borrowed "+b.title+"!");
        }
        else{
            System.out.println(this.name + " Sorry Cannot borrow "+ b.title);
        }
    }
    
    public void borrowMagazine(Magazine m){
        if(m.borrowItem()){
            this.borrowedBookCount++;
            System.out.println(this.name+" successfully borrowed "+m.title+"!");
        }
        else{
            System.out.println(this.name + " Sorry Cannot borrow "+ m.title);
        }
    }
    
    public void borrowDVD(DVD d){
        if(d.borrowItem()){
            this.borrowedBookCount++;
            System.out.println(this.name+" successfully borrowed "+d.title+"!");
        }
        else{
            System.out.println(this.name + " Sorry Cannot borrow "+ d.title);
        }
    }

    // Todo 1: Implement borrowItem(LibraryItem item) method
    // This ONE method should work for Books, DVDs, Magazines, and any future item types
    
    public void returnBook(Book b){
        b.returnItem();
        this.borrowedBookCount--;
        System.out.println(this.name+" returned "+b.title+"!");
    }
    
    
}
