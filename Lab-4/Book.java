/**
 * LAB 4: Classes and Objects (Beginner)
 * 
 * OBJECTIVE: Learn to create classes, objects, and understand basic encapsulation.
 * 
 * CONCEPTS: Class definition, constructors, instance variables, methods,
 * object creation, basic encapsulation
 */

public class Book {
    // TODO 1: Declare instance variables (attributes)
    // Add public variables for: title, author, bookId, availableCopies, price
    public String title;
    public String author;
    public int bookId;
    public int availableCopies;
    public double price;
    
    // TODO 2: Create constructor to initialize book properties
    // Parameters: title, author, bookId, availableCopies, price
    // Initialize all instance variables with the parameter values
    Book(String title, String author, int bookId, int availableCopies, double price){
        this.title = title;
        this.author = author;
        this.bookId = bookId;
        this.availableCopies = availableCopies;
        this.price = price;
    }
    
    // TODO 3: Create displayInfo() method to show book details
    // Format: "ID: [bookId] | [title] by [author] | Copies: [availableCopies] | Price: [price] birr"
    // This method should print the book information
    public void displayInfo(){
        System.out.println("Id: "+ this.bookId + " | " + this.title +" by " + this.author + " | Copies: " +this.availableCopies+ " | Price: " + this.price + "Birr");
    }
    
    // TODO 4: Create borrowBook() method to handle borrowing logic
    // Check if availableCopies > 0
    // If yes: decrease availableCopies by 1 and return true
    // If no: print "Sorry, [title] is currently unavailable." and return false
    public boolean borrowBook(){
        if(isAvailable()){
            this.availableCopies--;
            return true;
        }
        System.out.println("Sorry, " + this.title + " is currently unavailable.");
        return false;
    }
    
    // TODO 5: Create returnBook() method to handle returns
    // Increase availableCopies by 1
    // Print "Thank you for returning [title]!"
    public void returnBook(){
        this.availableCopies++;
        System.out.println("Thank you for returning "+this.title + "!");
    }
    
    // TODO 6: Create isAvailable() method
    // Return true if availableCopies > 0, false otherwise
    public boolean isAvailable(){
        return this.availableCopies > 0;
    }
    
}
