import java.util.Scanner;

/**
 * LAB 5: Inheritance
 * MAIN TEST CLASS
 * 
 * TODO: Test inheritance by creating objects of different subclasses
 * Learn: Creating subclass objects, using super() constructor, 
 * method overriding, and inheritance benefits
 */
public class LibraryControlInheritance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== LIBRARY MANAGEMENT SYSTEM - LAB 5 ===");
        System.out.println("Testing Inheritance with Different Item Types\n");
        
        // TODO 1: Create a Book object using the completed example
        System.out.println("=== CREATING A BOOK ===");
        Book book1 = new Book("Java Programming","John Doe","978-0-13-468599-1",450,"Education", false);
        book1.displayInfo();
        System.out.println();
        
        // TODO 2: Test Book-specific method
        book1.previewBook();
        System.out.println();
        
        // TODO 3: Test borrowing and returning on Book
        System.out.println("=== TESTING BORROW/RETURN ON BOOK ===");
        book1.borrowItem();
        System.out.println();
        book1.displayInfo();
        System.out.println();
        book1.returnItem();
        System.out.println();
        
        // TODO 4: Create a DVD object (students complete DVD class first)
        System.out.println("=== CREATING A DVD ===");
        // Uncomment when DVD class is complete:
        // DVD dvd1 = new DVD("Inception", "Christopher Nolan", 148, "PG-13", "Warner Bros");
        // dvd1.displayInfo();
        // dvd1.borrowItem();
        // dvd1.returnItem();
        System.out.println("(Complete DVD class to see this working)");
        System.out.println();
        
        // TODO 5: Create a Magazine object
        System.out.println("=== CREATING A MAGAZINE ===");
        // Uncomment when Magazine class is complete:
        // Magazine mag1 = new Magazine("Tech Monthly", "Tech Media Inc.", 45, "Technology");
        // mag1.displayInfo();
        // mag1.borrowItem();
        // mag1.displayInfo();
        // mag1.borrowItem();
        System.out.println("(Complete Magazine class to see this working)");
        System.out.println();
    }
    
}
