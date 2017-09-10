// assignment 12
// pair p134
// Singh, Bhavneet
// singhb
// Wang, Shiyu
// shiyu

import javalib.worldimages.*;

public class Frog {
    
    /*TEMPLATE
     * Fields:
     * this.dir......... --String
     * this.imagename... --String
     * this.loc.....     --Point
     * 
     * Methods:
     * this.image()....... --WorldImage
     * this.changeDir()........ --void
     * this.changePos()........ --void
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
    Frog(String dir, String imagename, Point loc) {
        this.dir = dir;
        this.imagename = imagename;
        this.loc = loc;
       }

    // hopping distance side to side
    int hopside = 5;
    
    // hopping distance from lane to lane
    int hopdistance = 50;
    
    // Draw this frog at its position and based on its image name
    public WorldImage image() {
        return new FromFileImage(this.loc, this.imagename);
    }
    
    // Change this frog's direction based on the given one
    public void changeDir(String newdir) {
        this.dir = newdir;
    }
    
    // Adjust this frog's position based on its direction
    // and its hop distance
    public void changePos() {
        if (this.dir.equals("left"))
            this.loc.x = this.loc.x - this.hopside;
        if (this.dir.equals("right"))
            this.loc.x = this.loc.x + this.hopside;
        if (this.dir.equals("down"))
            this.loc.y = this.loc.y + this.hopdistance;
        if (this.dir.equals("up"))
            this.loc.y = this.loc.y - this.hopdistance;
    }
    
}
