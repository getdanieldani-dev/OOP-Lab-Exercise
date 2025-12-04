/**
 * LAB 5: Inheritance
 * LIBRARY ITEM BASE CLASS - COMPLETE
 * 
 * This base class provides common properties and methods for all library items.
 * Students will create subclasses that inherit from this class.
 */
public class LibraryItem {
    // Protected fields - accessible by subclasses
    protected int itemId;
    protected String title;
    protected boolean isAvailable;
    
    // Static variable to generate unique IDs
    private static int nextId = 1000;
    
    /**
     * Constructor for LibraryItem
     * @param title The title of the item
     */
    public LibraryItem(String title) {
        this.itemId = getNextId();
        this.title = title;
        this.isAvailable = true;
    }
    
    /**
     * Generates the next unique ID for library items
     * @return The next available ID
     */
    private static int getNextId() {
        return nextId++;
    }
    
    /**
     * Borrows this item. Sets due date to 14 days from today.
     * Only works if the item is currently available.
     */
    public void borrowItem() {
        if (isAvailable) {
            isAvailable = false;
        } else {
            System.out.println("Cannot borrow. Item is already checked out.");
        }
    }
    
    /**
     * Returns this item to the library.
     */
    public void returnItem() {
        isAvailable = true;
        System.out.println("Item returned successfully.");
    }
    
    /**
     * Displays basic information about this item.
     * Subclasses should override this method to add their specific details.
     */
    public void displayInfo() {
        System.out.println("ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
    
    
    /**
     * Checks if the item is currently available for borrowing.
     * @return true if available, false otherwise
     */
    public boolean isAvailable() {
        return isAvailable;
    }
    
    /**
     * Gets the item's ID.
     * @return The item ID
     */
    public int getItemId() {
        return itemId;
    }
    
    /**
     * Gets the item's title.
     * @return The title
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * Gets the total number of library items created.
     * @return The count of items created
     */
    public static int getTotalItemsCreated() {
        return nextId - 1000;
    }
}
