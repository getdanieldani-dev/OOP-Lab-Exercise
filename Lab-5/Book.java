/**
 * LAB 5: Inheritance
 * BOOK SUBCLASS - COMPLETE EXAMPLE
 * 
 * This class shows how to extend LibraryItem.
 * Students should create similar classes for DVD, Magazine, etc.
 */
public class Book extends LibraryItem {
    // Book-specific properties
    private String author;
    private String isbn;
    private int pageCount;
    private String genre;
    private boolean isReference;
    
    /**
     * Constructor for Book
     * @param title The book title
     * @param author The book author
     * @param isbn The ISBN number
     * @param pageCount Number of pages
     * @param genre The book genre
     * @param isReference The book genre
     */
    
    public Book(String title, String author, String isbn, int pageCount, String genre, boolean isReference) {
        // Call parent constructor using super()
        super(title);
        this.author = author;
        this.isbn = isbn;
        this.pageCount = pageCount;
        this.genre = genre;
        this.isReference = isReference;
    }
    
    /**
     * Overrides the displayInfo method to show book-specific details.
     * Calls parent method first, then adds book details.
     */
    @Override
    public void displayInfo() {
        System.out.println("=== BOOK ===");
        // Call parent's displayInfo to show common properties
        super.displayInfo();
        // Add book-specific information
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Pages: " + pageCount);
        System.out.println("Genre: " + genre);
    }
    
    /**
     * Overrides the borroeItem method 
     * Reference books can not be borrowed
     */
    @Override
    public void borrowItem(){
        if (isReference) {
            System.out.println("Cannot borrow " + title + ". This is a REFERENCE book.");
            System.out.println("Reference books can only be used in the library.");
        } else {
            // Call parent's borrowItem if it's not a reference book
            super.borrowItem();
        }
    }
    
    
    /**
     * Book-specific method: Preview the book
     */
    public void previewBook() {
        System.out.println("Previewing '" + title + "' by " + author);
        System.out.println("Opening to a random page...");
    }
    
    // Getters for book-specific properties
    
    public String getAuthor() {
        return author;
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public int getPageCount() {
        return pageCount;
    }
    
    public String getGenre() {
        return genre;
    }
}
