/**
 * LAB 7: Exception Handling
 * MAIN TEST CLASS WITH COMPREHENSIVE EXCEPTION HANDLING
 * 
 * TODO: Students implement exception handling in service menu
 */

import java.util.Scanner;
public class LibraryControlMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Creating library items
        Book book1 = new Book("Java Programming","John Doe","978-0-13-468599-1",450,"Education", false);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0-7432-7356-5", 180, "Classic Fiction",false);
        Book book3 = new Book("A Brief History of Time", "Stephen Hawking", "978-0-553-38016-3", 256, "Science",false);
        Book book4 = new Book("Library Encyclopedia", "Various Authors",  "978-3-16-148410-0", 1200, "Reference", true);
        
        DVD dvd1 = new DVD("Inception", "Christopher Nolan", 148, "PG-13", "Warner Bros");
        DVD dvd2 = new DVD("Spirited Away", "Hayao Miyazaki", 125, "PG", "Studio Ghibli");
        DVD dvd3 = new DVD("Planet Earth", "Alastair Fothergill", 550, "TV-PG", "BBC");
        DVD dvd4 = new DVD("Stranger Things Season 1", "The Duffer Brothers", 480, "TV-14", "Netflix");
        
        Magazine mag1 = new Magazine("Tech Monthly", "Tech Media Inc.", 45, "Technology");
        Magazine mag2 = new Magazine("National Geographic", "National Geographic Society", 245, "Science & Nature");
        Magazine mag3 = new Magazine("TIME", "Time USA", 156, "News & Politics");
        Magazine mag4 = new Magazine("Rolling Stone", "Penske Media", 278, "Music & Entertainment");
        
        LibraryItem [] libraryItems = {book1,book2,book3,book4,
            dvd1,dvd2,dvd3,dvd4,
            mag1,mag2,mag3,mag4,
        };
        
        System.out.println("=== TESTING BORROW/RETURN ON LIBRARY ITEM ===");
        System.out.println();

        Member member1 = new Member("Alice", 1001);
        Member member2 = new Member("Bob", 1002);
        
        
        // Todo 1: Handle all the exceptions you throw and other's that might be thrown (InputMissmatch and ArrayOutOfBound exceptions).
        boolean running = true;
        while (running) {
            System.out.println("\n=== POLYMORPHISM INTERACTIVE DEMO ===");
            System.out.println("1. Borrow an item");
            System.out.println("2. Return an item");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            int choice = input.nextInt();
            
            for(int i = 0; i < libraryItems.length; i++){
                System.out.println("Item Index: " + i);
                libraryItems[i].displayInfo();
                System.out.println();
            }
            
            switch (choice) {
                case 1:
                    System.out.print("Please enter the index of the item you want to borrow: ");
                    int indexToBorrow = input.nextInt();
                    System.out.println();
                    member1.borrowItem(libraryItems[indexToBorrow]);
                    break;
                case 2:
                    System.out.print("Please enter the index of the item you want to return: ");
                    int indexToReturn = input.nextInt();
                    System.out.println();
                    member1.returnItem(libraryItems[indexToReturn]);
                    break;
                case 3:
                    running = false;
                    break;
            }
        
        }
        
    }
}
