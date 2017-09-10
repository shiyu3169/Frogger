// assignment 12
// pair p134
// Singh, Bhavneet
// singhb
// Wang, Shiyu
// shiyu

// Represents a predicate to check if a Frenemy is out of bounds
public class OutOfBounds implements Pred<Frenemy> {
    /*TEMPLATE
     * Fields:
     * None
     * 
     * Methods:
     * this.question(Frenemy, int, int)......   --boolean
     * 
     * Methods for fields:
     * None
     * 
     */
    
    // is the given Frenemy out of bounds?
    public boolean question(Frenemy f, int width, int height) {
        return (f.loc.x > width) ||
               (f.loc.x < 0) ||
               (f.loc.y > height) ||
               (f.loc.y < 0);
    }
    
}
