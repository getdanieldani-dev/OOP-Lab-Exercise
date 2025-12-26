/**
 * LAB 8: GUI with Swing - STUDENT EXERCISE
 * 
 * TODO: Students complete this simplified GUI
 * 
 * Tasks:
 * 1. Create and arrange components
 * 2. Add action listeners to buttons
 * 3. Implement button functionality
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class LibraryGUI {
    public static void main(String[] args){
        JFrame libraryWindow = new JFrame();
        libraryWindow.setSize(700, 400);
        libraryWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        libraryWindow.setLayout(new BorderLayout());
        
        Member member1 = new Member("Alice", 1001);
        
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
        
        JLabel title = new JLabel("Liberary Management System", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        
        JTextArea displayArea = new JTextArea(15, 40);
        displayArea.setEditable(false);
        displayArea.setLineWrap(true);
        
        JScrollPane scrollPane = new JScrollPane(displayArea); 
        
        JPanel bottomPanel = new JPanel();
        /* TODO add display button, text field to enter borrow index, borrow button, 
         * text field to enter return index and return button on the bottom panel
         * 
         * add action listener to the display button, when cliked all avilable items 
         * should be displayed on the displayArea, you can use the setText method of the text area,
         * the getLibraryItemsInfo helper method will return all the avilable items as a string.
         *
         * add action listener to the borrow button, when clicked it should borrow the selected item in the
         * borrow index text field and display the message, use member1 to borrow the item.
         *
         * add action listener to the return button, when clicked it should return the selected item in the
         * return index text field and display the message, use member1 to borrow the item.
        */
        libraryWindow.add(title, BorderLayout.NORTH);
        libraryWindow.add(scrollPane, BorderLayout.CENTER);
        libraryWindow.add(bottomPanel, BorderLayout.SOUTH);
        libraryWindow.setVisible(true);
    }
    
    
    public static String getLibraryItemsInfo(LibraryItem [] libraryItems){
        String libraryInfo = "";
        for(int i = 0; i < libraryItems.length; i++){
            String isAvailable = libraryItems[i].isAvailable() ? "(Available)" : "(Borrowed)";
            libraryInfo += "[" + i + "]: " + libraryItems[i].getTitle() + " " + isAvailable + "\n";
        }
        
        return libraryInfo;
    }
}
