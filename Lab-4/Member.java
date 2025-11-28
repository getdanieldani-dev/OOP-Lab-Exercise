/**
 * LAB 4: Classes and Objects (Beginner)
 * 
 * Member class representing a library member
 */

public class Member {
    // TODO 1: Declare instance variables (attributes)
    // Add public variables for: name, memberId, borrowedBooksCount
    public String name;
    public int id;
    public int borrowedBookCount;
    
    // TODO 2: Create constructor to initialize member properties
    // Parameters: name, memberId
    // Initialize name and memberId with parameter values
    // Set borrowedBooksCount to 0 (new members start with 0 borrowed books)
    Member(String name, int id){
        this.name = name;
        this.id = id;
        this.borrowedBookCount = 0;
    }
    
    // TODO 3: Create displayInfo() method to show member details
    // Format: "Member: [name] (ID: [memberId]) | Borrowed Books: [borrowedBooksCount]"
    // This method should print the member information
    public void displayInfo(){
        System.out.println("Member: "+ this.name+ " (ID: " + this.id +") | Borrowed Books: " + this.borrowedBookCount);
    }
    
    // TODO 4: Create borrowBook() method that takes a Book parameter
    // Check if the book is available using book.isAvailable()
    // If available: 
    //   - Call book.borrowBook()
    //   - Increase borrowedBooksCount by 1
    //   - Print "[name] successfully borrowed [book title]!"
    // If not available: print "Cannot borrow [book title] - not available"
    public void borrowBook(Book b){
        if(b.borrowBook()){
            this.borrowedBookCount++;
            System.out.println(this.name+" successfully borrowed "+b.title+"!");
        }
        else{
            System.out.println("Cannot borrow "+ b.title +" - not available");
        }
    }
    
    // TODO 5: Create returnBook() method that takes a Book parameter
    // Call book.returnBook()
    // Decrease borrowedBooksCount by 1 (but not below 0)
    // Print "[name] returned [book title]"
    public void returnBook(Book b){
        b.returnBook();
        this.borrowedBookCount--;
        System.out.println(this.name+" returned "+b.title+"!");
    }
    
    
}
