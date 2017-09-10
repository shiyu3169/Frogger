// assignment 12
// pair p134
// Singh, Bhavneet
// singhb
// Wang, Shiyu
// shiyu

// Represents a predicate to check if a Frog is out of bounds
public class OutOfBoundsFrog implements Pred<Frog> {
    
    /*TEMPLATE
     * Fields:
     * None
     * 
     * Methods:
     * this.question(Frog, int, int)......   --boolean
     * 
     * Methods for fields:
     * None
     * 
     */
    
    
    // is the given Frog out of bounds?
    public boolean question(Frog f, int width, int height) {
        return (f.loc.x > width) ||
               (f.loc.x < 0) ||
               (f.loc.y > height) ||
               (f.loc.y < 0);
    }
    
}
