/**
 * LAB 6: Polymorphism
 * MAIN TEST CLASS - STUDENT TODO
 * 
 * TODO: Students demonstrate polymorphism in this lab
 */

import java.util.Scanner;
public class LibraryControlMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== LIBRARY MANAGEMENT SYSTEM - LAB 5 ===");
        System.out.println("Testing Inheritance with Different Item Types\n");

        System.out.println("=== Creating Library Members ===");

        Member member1 = new Member("Alice", 1001);
        Member member2 = new Member("Bob", 1002);
        
        
        // Todo 1 Update the borrow mechanism to use the new borrowItem method
        System.out.println("=== CREATING A BOOK ===");
        Book book1 = new Book("Java Programming","John Doe","978-0-13-468599-1",450,"Education", false);
        book1.displayInfo();
        System.out.println();
    
        System.out.println("=== TESTING MEMBER BORROW BOOK ===");
        member1.borrowBook(book1);
        System.out.println();

        System.out.println("=== CREATING A DVD ===");
        DVD dvd1 = new DVD("Inception", "Christopher Nolan", 148, "PG-13", "Warner Bros");
        dvd1.displayInfo();
        System.out.println();
        member1.borrowDVD(dvd1);
        System.out.println();
        member2.borrowDVD(dvd1);
        System.out.println();
        System.out.println("(Complete DVD class to see this working)");
        System.out.println();
        
        System.out.println("=== CREATING A MAGAZINE ===");

        Magazine mag1 = new Magazine("Tech Monthly", "Tech Media Inc.", 45, "Technology");
        mag1.displayInfo();
        System.out.println();
        member2.borrowMagazine(mag1);
        System.out.println();
        member1.borrowMagazine(mag1);
        System.out.println();
        System.out.println("(Complete Magazine class to see this working)");
        System.out.println();
        
        //Todo 2 create an array of library items and use for loop to display their info
        // Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0-7432-7356-5", 180, "Classic Fiction",false);
        // Book book3 = new Book("A Brief History of Time", "Stephen Hawking", "978-0-553-38016-3", 256, "Science",false);
        // Book book4 = new Book("Library Encyclopedia", "Various Authors",  "978-3-16-148410-0", 1200, "Reference", true);
        
        // DVD dvd2 = new DVD("Spirited Away", "Hayao Miyazaki", 125, "PG", "Studio Ghibli");
        // DVD dvd3 = new DVD("Planet Earth", "Alastair Fothergill", 550, "TV-PG", "BBC");
        // DVD dvd4 = new DVD("Stranger Things Season 1", "The Duffer Brothers", 480, "TV-14", "Netflix");
        
        // Magazine mag2 = new Magazine("National Geographic", "National Geographic Society", 245, "Science & Nature");
        // Magazine mag3 = new Magazine("TIME", "Time USA", 156, "News & Politics");
        // Magazine mag4 = new Magazine("Rolling Stone", "Penske Media", 278, "Music & Entertainment");
        
        /* Todo 3   - Let the user repeatedly choose one of the following options:
         *        1. Borrow a item - list all items and let the user coohse which 
         *        2. Exit
         *    - Perform the appropriate action based on the user's choice.
         *    - Continue showing the menu until the user chooses to exit.
         *    - use member1 as th user
         */
    }
}