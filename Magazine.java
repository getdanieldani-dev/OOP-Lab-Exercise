/**
 * LAB 5: Inheritance
 * MAGAZINE SUBCLASS - STUDENT TODO
 * 
 * TODO: Create a Magazine class that extends LibraryItem
 * Magazines have different properties and loan rules.
 */
public class Magazine extends LibraryItem {
    // TODO 1: Add Magazine-specific properties
    // Add private fields for: publisher (String), issueNumber (int), category (String),
    // timesRenewed (int) - tracks how many times borrowed
    
    
    // TODO 2: Create constructor using super()
    // Parameters: title, publisher, issueNumber, category,
    // and set timeRenewed to 0
    
    
    // TODO 3: Override displayInfo() method
    // Show magazine information including all properties
    
    // TODO 4: Override borrowItem() with special rules
    // Magazines can only be borrowed ONCE (timesRenewed < 1)
    // If timesRenewed >= 1, say "Cannot borrow - already borrowed before"
    // Otherwise, borrow normally and increment timesRenewed
    
    
    // TODO 5: Add Magazine-specific method
    // Example: public void browseArticles() { ... }
    // prints "Borowsing Article"
    
    // TODO 6: Add getter methods for all Magazine-specific properties
    
    
}