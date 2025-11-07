import java.util.Scanner;

/**
 * LAB 4: Classes and Objects (Beginner)
 * 
 * Main class to test Book and Member objects
 */

public class LibraryControlOOP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== LIBRARY MANAGEMENT SYSTEM - LAB 3 ===");
        System.out.println("Creating Objects and Testing Basic OOP Concepts\n");
        
        // TODO 1: Create Book objects using constructor
        // Create at least 3 Book objects with different properties
        // Example: 
        // book1 => ("Java Programming", "John Doe", 101, 3, 450.0);
        // book2 => ("Data Structures", "Jane Smith", 102, 2, 380.0);
        // book3 => ("Algorithms", "Bob Johnson", 103, 1, 500.0);
        
        
        // TODO 2: Create Member objects using constructor
        // Create at least 2 Member objects
        // Example:
        // Member member1 = new Member("Alice", 1001);
        // Member member2 = new Member("Bob", 1002);
        
        
        // TODO 3: Test book display functionality
        System.out.println("=== AVAILABLE BOOKS ===");
        // Call displayInfo() method on each book object
        
        
        // TODO 4: Test member display functionality
        System.out.println("\n=== LIBRARY MEMBERS ===");
        // Call displayInfo() method on each member object
        
        
        // TODO 5: Test borrowing books
        System.out.println("\n=== TESTING BOOK BORROWING ===");
        // Let member1 borrow book1
        // Let member1 borrow book2  
        // Let member2 borrow book3
        // Let member2 try to borrow book2
        // Let member2 try to borrow book2 again (should fail if no copies left)
        
        
        // TODO 6: Test returning books
        System.out.println("\n=== TESTING BOOK RETURNING ===");
        // Let member1 return book2
        // Let member2 borrow book2 (should work now)
        
        
        // TODO 7: Display updated information
        System.out.println("\n=== UPDATED BOOK STATUS ===");
        // Call displayInfo() on all books to show updated copies
        
        System.out.println("\n=== UPDATED MEMBER STATUS ===");
        // Call displayInfo() on all members to show updated borrowed counts
        
        
        // TODO 8: Interactive menu system (Advanced)
        System.out.println("\n=== INTERACTIVE LIBRARY SYSTEM ===");
        /*
        Implement a simple menu:
        1. Display all books
        2. Display all members  
        3. Borrow a book (ask for member and book)
        4. Return a book (ask for member and book)
        5. Exit
        
        Use the objects you created and allow user interaction
        */
        
        
        // TODO 9: Test edge cases
        System.out.println("\n=== TESTING EDGE CASES ===");
        // Try to borrow a book with 0 copies
        // Test the isAvailable() method
        
        
        System.out.println("\n=== LAB 3 COMPLETE ===");
        input.close();
    }
    
    // TODO 10: Helper method to display all books
    public static void displayAllBooks(Book[] books) {
        System.out.println("=== ALL BOOKS IN LIBRARY ===");
        // Loop through books array and call displayInfo() for each
    }
    
    // TODO 11: Helper method to display all members  
    public static void displayAllMembers(Member[] members) {
        System.out.println("=== ALL LIBRARY MEMBERS ===");
        // Loop through members array and call displayInfo() for each
    }
}
