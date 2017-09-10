// assignment 12
// pair p134
// Singh, Bhavneet
// singhb
// Wang, Shiyu
// shiyu
 
// Represents a a moving object that is either a friend or an enemy
public class Friend extends Frenemy {
    /*TEMPLATE
     * Fields:
     * this.dir.........  --String
     * this.imagename...  --String
     * this.loc.....      --Point
     * this.speed......   --int
     * 
     * Methods:
     * this.move()....... --void
     * 
     * 
     * Methods for Fields:
     * this.loc.collide(Point)..... --boolean
     * this.loc.disTo(Point)....... --double
     * this.loc.move(int).......... --void
     * 
     */
    Friend(String dir, String imagename, Point loc, int speed) {
        super(dir, imagename, loc, speed);
    }
    
    // Move this frenemy by its speed
    public void move() {
        this.loc.move(this.speed, this.dir);
    }
}
