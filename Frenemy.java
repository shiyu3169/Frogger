// assignment 12
// pair p134
// Singh, Bhavneet
// singhb
// Wang, Shiyu
// shiyu

import javalib.worldimages.*;

// Represents a a moving object that is either a friend or an enemy
abstract public class Frenemy {
    
    /*TEMPLATE
     * Fields:
     * this.dir......... --String
     * this.imagename... --String
     * this.loc.....     --Point
     * this.speed.....   --int
     * 
     * Methods:
     * this.collide(Frog)......   --boolean
     * this.image().......        --WorldImage
     * this.move()........        --void
     * this.resetLoc(int)........ --void
     * 
     * 
     * Methods for Fields:
     * this.loc.collide(Point)..... --boolean
     * this.loc.disTo(Point)....... --double
     * this.loc.move(int).......... --void
     * 
     */
    
    String dir;
    String imagename;
    Point loc;
    int speed;
    Frenemy(String dir, String imagename, Point loc, int speed) {
        this.dir = dir;
        this.imagename = imagename;
        this.loc = loc;
        this.speed = speed;
    }
    
    // Did this Frenemy collided with the given frog?
    public boolean collide(Frog frog) {
        return this.loc.collide(frog.loc);
        }
    
    // Draw this Frenemy at its position and based on its image name
    public WorldImage image() {
        return new FromFileImage(this.loc, this.imagename);
    }
    
    // Move this frenemy by its speed
    public abstract void move();
    
    // Reset this Frenemy's position based on it's dir
    public <T> void resetLoc(int width) {
        if (this.dir.equals("left"))
            this.loc.x = width;
        
        if (this.dir.equals("right"))
            this.loc.x = 0;
    }
    
}
