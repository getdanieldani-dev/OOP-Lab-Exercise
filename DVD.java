/**
 * LAB 6: Polymorphism
 * MAIN TEST CLASS - STUDENT TODO
 * 
 * TODO: Students demonstrate polymorphism in this lab
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

}