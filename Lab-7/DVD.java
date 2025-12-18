/**
 * LAB 7: Exception
 * 
 * 
 */
public class DVD extends LibraryItem {
    private String director;
    private int duration;
    private String rating;
    private String studio;
    
    public DVD(String title, String director, int duration, String rating, String studio){
        super(title);
        this.director = director;
        this.duration = duration;
        this.rating = rating;
        this.studio = studio;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("=== DVD ===");
        // Call parent's displayInfo to show common properties
        super.displayInfo();
        // Add book-specific information
        System.out.println("Director: " + director);
        System.out.println("Duration: " + duration);
        System.out.println("Rating: " + rating);
        System.out.println("Studio: " + studio);
    }

    
    
    // TODO 4: Add a DVD-specific method
    // playTrailer() { ... }
    // prints "Playing Trailer"
    
    // TODO 5: Add getter methods for all DVD-specific properties
    
    
}
