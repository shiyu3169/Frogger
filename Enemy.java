// assignment 12
// pair p134
// Singh, Bhavneet
// singhb
// Wang, Shiyu
// shiyu

// Represents a a moving object that is either a friend or an enemy
public class Enemy extends Frenemy {
    /*TEMPLATE
     * Fields:
     * this.dir......... --String
     * this.imagename...--String
     * this.Point.....   --loc
     * this.speed......  --int
     * 
     * Methods:
     * this.move()....... --void
     * 
     * 
     * Methods for fields:
     * this.loc.collide(Point)..... --boolean
     * this.loc.disTo(Point)....... --double
     * this.loc.move(int).......... --void
     * 
     */
    Enemy(String dir, String imagename, Point loc, int speed) {
        super(dir, imagename, loc, speed);
    }
    
    // Move this frenemy by its speed
    public void move() {
        this.loc.move(this.speed, this.dir);
    }
}
