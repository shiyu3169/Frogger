// assignment 12
// pair p134
// Singh, Bhavneet
// singhb
// Wang, Shiyu
// shiyu

import java.awt.*;
import java.util.*;

import javalib.impworld.*;
import javalib.worldimages.*;

// Represents a Frogger game
public class Frogger extends World {
    /*TEMPLATE
     * Fields:
     * this.froggy.........                 --Frog
     * this.enemies...                      --ArrayList<Frenemy>
     * this.friends.....                    --ArrayList<Frenemy>
     * this.lives......                     --int
     * 
     * Methods:
     * this.makeImage().....                --WorldImage
     * this.onKeyEvent(String)..            --void
     * this.onTick()........                --void
     * this.onTickEnemy(Pred<Frenemy>)      --void
     * this.onTickFriend(Pred<Frenemy>)     --void
     * this.inLava(ArrayList<Frenemy>, int) --boolean
     * this.resetFrog()......               --void
     * this.worldEnds()......               --WorldEnd
     * this.lastImage(String)......         --WorldImage
     * 
     * 
     * 
     * Methods for fields:
     * this.froggy.image().....         --WorldImage
     * this.froggy.changeDir(String)... --void
     * this.froggy.changePos(Strin).... --void
     */
    Frog froggy;
    ArrayList<Frenemy> enemies;
    ArrayList<Frenemy> friends;
    int lives;
    
    Frogger(Frog froggy, ArrayList<Frenemy> enemies,
            ArrayList<Frenemy> friends, int lives) {
        this.froggy = froggy;
        this.enemies = enemies;
        this.friends = friends;
        this.lives = lives;
    }
    
    // represents the width and height of the game screen
    int width = 400;
    int height = 600;
    
  //represent the background of the game
    WorldImage background = new RectangleImage(new Point(width / 2, 570),
                            width, 75, Color.GREEN).overlayImages(
                            new RectangleImage(new Point(width / 2, 35),
                            width, 75, Color.green).overlayImages(
                            new RectangleImage(new Point(width / 2, 450),
                            width, 250, Color.RED).overlayImages(
                            new RectangleImage(new Point(width / 2, 200),
                            width, 250, Color.black).overlayImages(
                            new RectangleImage(new Point(width / 2, 75),
                            width, 2, Color.yellow).overlayImages(
                            new RectangleImage(new Point(width / 2, 125),
                            width, 2, Color.yellow).overlayImages(
                            new RectangleImage(new Point(width / 2, 175),
                            width, 2, Color.yellow).overlayImages(
                            new RectangleImage(new Point(width / 2, 225),
                            width, 2, Color.yellow).overlayImages(
                            new RectangleImage(new Point(width / 2, 275),
                            width, 2, Color.yellow).overlayImages(
                            new RectangleImage(new Point(width / 2, 325),
                            width, 2, Color.yellow))))))))));
    
    // draws this world's frog and friends and enemies
    public WorldImage makeImage() {
        // draw the background
        WorldImage w = background.overlayImages(
                new TextImage(new Point(30, 10), "Lives: " + 
                        this.lives, 10, Color.MAGENTA));
        
           // draw the enemies
           for (int i = 0; i < enemies.size(); i = i + 1) {
              w = w.overlayImages(enemies.get(i).image());
           }
           
           // draw the friends
           for (int j = 0; j < friends.size(); j = j + 1) {
              w = w.overlayImages(friends.get(j).image());
           }
           
           return w.overlayImages(this.froggy.image());
      }
    
    // the frog is moved based on the given String if
    // the given String corresponds to a valid direction
    public void onKeyEvent(String dir) {
            { this.froggy.changeDir(dir);
              this.froggy.changePos(); }
    }
    
    
    // Move the enemies and friend one tick
    // Check for collisions and adjust the game accordingly
    public void onTick() {
        
        Pred<Frenemy> out = new OutOfBounds();
        Pred<Frog> outfrog = new OutOfBoundsFrog();
        
        // on tick for enemies
        this.onTickEnemy(out);
        
        // on tick for friends
        this.onTickFriend(out);
        
        // Kill the frog if out of bounds
        if (outfrog.question(this.froggy, width, height))
            this.resetFrog();
        
    }
    
    // Change this Frogger's enemies by one tick
    public void onTickEnemy(Pred<Frenemy> out) {
        
        for (Frenemy f : enemies) {
            // Move the enemies one tick
            f.move();
            
            // If any enemy is out of bounds, reset its location
            if (out.question(f, width, height))
                f.resetLoc(this.width);
            
            // Check if the enemies to collide 
            // If so kill the frog
            if (f.collide(this.froggy))
                this.resetFrog();
        }
    }
          
    
    // Change this Frogger's friends by one tick
    public void onTickFriend(Pred<Frenemy> out) {
             
        for (Frenemy f : friends) {
            // move the friends
            f.move();
            
            // If any friend is out of bounds, reset its location
            if (out.question(f, width, height))
                f.resetLoc(this.width);
            
            // If the frog does not collide with this friend
            // and it shares the same y position but different x
            // then kill the frog
            if (this.inLava(friends, 0) &&
                (this.froggy.loc.y == f.loc.y))
                this.resetFrog();
            
            // Otherwise move the frog with the friend
            if (f.collide(this.froggy))
                this.froggy.loc.move(
                 f.speed,
                 f.dir); 
        }
        
                        
     
        
    }
    // checks if the frog does not collide with a friend
    public boolean inLava(ArrayList<Frenemy> alist, int n) {
        if (alist.isEmpty() || (n == alist.size() - 1))
               return true;
        else return  (!alist.get(n).collide(this.froggy) &&
                       this.inLava(alist, n + 1));
    }
    
   
    
    
    // Reset this frogger game's frog and subtract a life
    public void resetFrog() {
        this.lives = this.lives - 1;
        this.froggy = new Frog(this.froggy.dir,
                               this.froggy.imagename, 
                               new Point(width / 2, 50));
    }
    
    // End this frogger game 
    // if no lives are remaining
    // or if the frog reached the bottom of the screen
    public WorldEnd worldEnds() {
        if (this.lives <= 0)
            return new WorldEnd(true, 
                    new TextImage(new Point(250, 250),
                            "You're Dead!", Color.red)); 
        if (this.froggy.loc.y > height)
            return new WorldEnd(true,
                    new TextImage(new Point(250, 250), 
                            "You Won!", Color.green));
        else return new WorldEnd(false, this.makeImage());
        
    }
    
    // produce the last image of this frogger game
    public WorldImage lastImage(String s) {
        return this.makeImage().overlayImages(
               new TextImage(new Posn(width / 2, height / 2), s, Color.black));
    }

}
