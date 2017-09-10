// assignment 12
// pair p134
// Singh, Bhavneet
// singhb
// Wang, Shiyu
// shiyu

import javalib.worldimages.Posn;

// Represents a Cartesian Point
public class Point extends Posn {
    
    /*TEMPLATE
     * Fields:
     * this.x......   --int
     * this.y......   --int
     * 
     * Methods:
     * this.collide(Point)..... --boolean
     * this.disTo(Point)....... --double
     * this.move(int).......... --void
     * 
     * Methods for Fields:
     * None
     * 
     */
    
    Point(int x, int y) {
        super(x, y);
    }
    
    // the value of the radius of collision 
    int collideradius = 32;
    
    // checks if this point collided with the given one
    public boolean collide(Point other) {
        return this.disTo(other) <= collideradius;
    }
    
    // computes the distance between this point and the given one
    public double disTo(Point other) {
        return Math.sqrt((this.x - other.x) * (this.x - other.x) +
               (this.y - other.y) * (this.y - other.y));
    }
    
    // move this point's x position by the given int value in the given dir
    public void move(int dist, String dir) {
        if (dir.equals("left"))
            this.x = this.x - dist;
        
        if (dir.equals("right"))
            this.x = this.x + dist;
        
        
        }
    
   
    
}
