import java.util.Scanner;

public class LibraryControl {
    public static void main(String[] args) {
        //Scanner object input to accept input from users.
        Scanner input = new Scanner(System.io);
        
        // Arrays for book titles and availability
        String[] bookTitles = {"Java Programming", "Data Structures", "Algorithms", "Database Systems"};
        int[] bookCopies = {3, 2, 1, 4};
        double[] bookPrices = {450.0, 380.0, 500.0, 420.0}; // price per book in birr

        // Member data
        String[] memberNames = {"Alice", "Bob", "Charlie"};
        int[] borrowedCount = {2, 0, 1};
        
        /*
         * ========================= LAB TODO =========================
         * In this lab, you will complete a simple library management system.
         * The system should allow members to log in, borrow books, return books,
         * and view available books.
         * 
         * -------------------- INSTRUCTIONS --------------------
         * 1. **Display Books**
         *    - Write a loop to print all available books in the following format:
         *      index: <book name> - Available copies: <count> - Price: <price> birr
         *    - Example:
         *      0: Java Programming - Available copies: 3 - Price: 450.0 birr
         *      1: Data Structures - Available copies: 2 - Price: 380.0 birr
         *
         * 2. **Calculate Total Price of Available Books**
         *    - Write a loop to calculate and print the total value of all books
         *      currently available in the library.
         *    - The total value = sum of (bookCopies[i] * bookPrices[i]) for all books.
         *    - Example output:
         *      "Total value of available books: 6,280.0 birr"
         *
         * 3. **Member Login**
         *    - Ask the user to choose their member index (0, 1, or 2).
         *    - Display a welcome message, for example:
         *      "Welcome, Alice!"
         *
         * 4. **Borrow a Book**
         *    - Ask the user to enter the index of the book they want to borrow.
         *    - Check if the selected book has at least one available copy.
         *        * If available: print "You borrowed this book!" 
         *          and update:
         *            - bookCopies[index] = bookCopies[index] - 1
         *            - borrowedCount[memberIndex] = borrowedCount[memberIndex] + 1
         *        * If not available: print "Sorry, this book is currently unavailable."
         *
         * 5. **Return a Book**
         *    - Ask the user to enter the index of the book they want to return.
         *    - Increase the available copy count:
         *        bookCopies[index] = bookCopies[index] + 1
         *      and reduce the member's borrowed count:
         *        borrowedCount[memberIndex] = borrowedCount[memberIndex] - 1
         *    - Print "Thank you! You returned this book."
         *
         * 6. **Service Menu**
         *    - Let the user repeatedly choose one of the following options:
         *        1. Borrow a book
         *        2. Return a book
         *        3. Exit
         *    - Perform the appropriate action based on the user's choice.
         *    - Continue showing the menu until the user chooses to exit.
         *
         * ---------------------------------------------------------
         * Use loops, conditionals, and array operations to complete the tasks.
         * =========================================================
         */
    }
}


