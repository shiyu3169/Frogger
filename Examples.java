// assignment 12
// pair p134
// Singh, Bhavneet
// singhb
// Wang, Shiyu
// shiyu

import tester.*;

import java.awt.Color;
import java.util.*;

import javalib.worldimages.FromFileImage;
import javalib.worldimages.Posn;
import javalib.worldimages.RectangleImage;
import javalib.worldimages.TextImage;
import javalib.worldimages.WorldEnd;
import javalib.worldimages.WorldImage;


// Represents a class to test methods in the Frogger game,
// and associated classes
public class Examples {
    
    
    
    // Sample ints ****************************************
    
    // constant heights and width
    int width = 400;
    int height = 600;
    
    // for constant frenemy y position
      // for cars 
      int lane1 = 100;
      int lane2 = 150;
      int lane3 = 200;
      int lane4 = 250;
      int lane5 = 300;
    
      // for logs and turtles
      int stream1 = 350;
      int stream2 = 400;
      int stream3 = 450;
      int stream4 = 500;
      int stream5 = 550;
    
    // for constant speeds for frenemy
      //slow
      int speedslow = 1;
      
      //fast
      int speedfast = 2;
    
      
      
    // Sample Pred *********************************
    Pred<Frenemy> out = new OutOfBounds();
    Pred<Frog> out2 = new OutOfBoundsFrog();

    
    
    // Sample Points **************************************
    
    // for the frog
    // inbounds collide
    Point deadfrogp;
    
    // out of bounds
    Point outfrogp;
    
    // safe frog
    Point safefrogp;
    
    // win frog
    Point winfrogp;

    // inlava frog
    Point inlavafrogp;

    // onturtle frog
    Point onturtlefrogp;
    
    // for lane1
    Point frenemyp1l1 = new Point(100, lane1);
    Point frenemyp2l1 = new Point(200, lane1);
    Point frenemyp3l1 = new Point(300, lane1);
    Point frenemyp4l1 = new Point(400, lane1);
    
    // for lane2
    Point frenemyp1l2 = new Point(50, lane2);
    Point frenemyp2l2 = new Point(150, lane2);
    Point frenemyp3l2 = new Point(250, lane2);
    Point frenemyp4l2 = new Point(350, lane2);
    
    // for lane3
    Point frenemyp1l3 = new Point(0, lane3);
    Point frenemyp2l3 = new Point(100, lane3);
    Point frenemyp3l3 = new Point(200, lane3);
    Point frenemyp4l3 = new Point(300, lane3);
    
    // for lane4
    Point frenemyp1l4 = new Point(30, lane4);
    Point frenemyp2l4 = new Point(130, lane4);
    Point frenemyp3l4 = new Point(230, lane4);
    Point frenemyp4l4 = new Point(330, lane4);
    
    // for lane5
    Point frenemyp1l5 = new Point(12, lane5);
    Point frenemyp2l5 = new Point(112, lane5);
    Point frenemyp3l5 = new Point(212, lane5);
    Point frenemyp4l5 = new Point(312, lane5);
    
    // for stream1
    Point frenemyp1s1 = new Point(100, stream1);
    Point frenemyp2s1 = new Point(200, stream1);
    Point frenemyp3s1 = new Point(300, stream1);
    Point frenemyp4s1 = new Point(400, stream1);
    
    // for stream2
    Point frenemyp1s2 = new Point(30, stream2);
    Point frenemyp2s2 = new Point(130, stream2);
    Point frenemyp3s2 = new Point(230, stream2);
    Point frenemyp4s2 = new Point(330, stream2);
    
    // for stream3
    Point frenemyp1s3 = new Point(0, stream3);
    Point frenemyp2s3 = new Point(100, stream3);
    Point frenemyp3s3 = new Point(200, stream3);
    Point frenemyp4s3 = new Point(300, stream3);  
 
    // for stream4
    Point frenemyp1s4 = new Point(56, stream4);
    Point frenemyp2s4 = new Point(156, stream4);
    Point frenemyp3s4 = new Point(256, stream4);
    Point frenemyp4s4 = new Point(356, stream4);
    
    // for stream5
    Point frenemyp1s5 = new Point(101, stream5);
    Point frenemyp2s5 = new Point(201, stream5);
    Point frenemyp3s5 = new Point(301, stream5);
    Point frenemyp4s5 = new Point(401, stream5);
 
    
    
    // Sample Frog ****************************************
    // dead frog
    Frog deadfrog;
    
    // out of bounds frog
    Frog outfrog;
    
    // safe frog
    Frog safefrog;
    
    // win frog
     Frog winfrog;
    
    // inlava frog
     Frog inlavafrog;
     
    // onturtle frog
    Frog onturtlefrog;
    
    // Sample Frenemy: Enemy *******************************
    
    // for lane1
    Frenemy enemy1lane1 = new Enemy("left", 
                               "car.png", 
                               frenemyp1l1, 
                               speedslow);
    Frenemy enemy2lane1 = new Enemy("left",
                               "car.png",
                               frenemyp2l1,
                               speedslow);
    Frenemy enemy3lane1 = new Enemy("left",
                               "car.png",
                               frenemyp3l1,
                               speedslow);
    Frenemy enemy4lane1 = new Enemy("left",
                               "car.png",
                               frenemyp4l1,
                               speedslow);
    
    // for lane2
    Frenemy enemy1lane2 = new Enemy("right",
                               "car.png", 
                               frenemyp1l2, 
                               speedfast);
    Frenemy enemy2lane2 = new Enemy("right",
                               "car.png",
                               frenemyp2l2, 
                               speedfast);
    Frenemy enemy3lane2 = new Enemy("right",
                               "car.png", 
                               frenemyp3l2, 
                               speedfast);
    Frenemy enemy4lane2 = new Enemy("right",
                               "car.png",
                               frenemyp4l2,
                               speedfast);
    
    // for lane3
    Frenemy enemy1lane3 = new Enemy("left",
                               "car.png",
                               frenemyp1l3, 
                               speedfast);
    Frenemy enemy2lane3 = new Enemy("left",
                               "car.png",
                               frenemyp2l3,
                               speedfast);
    Frenemy enemy3lane3 = new Enemy("left",
                               "car.png",
                               frenemyp3l3,
                               speedfast);
    Frenemy enemy4lane3 = new Enemy("left",
                               "car.png",
                               frenemyp4l3,
                               speedfast);
    
    // for lane4
    Frenemy enemy1lane4 = new Enemy("right",
                               "car.png",
                               frenemyp1l4,
                               speedslow);
    Frenemy enemy2lane4 = new Enemy("right",
                               "car.png",
                               frenemyp2l4,
                               speedslow);
    Frenemy enemy3lane4 = new Enemy("right",
                               "car.png", 
                               frenemyp3l4,
                               speedslow);
    Frenemy enemy4lane4 = new Enemy("right",
                               "car.png",
                               frenemyp4l4,
                               speedslow);
    
    // for lane5
    Frenemy enemy1lane5 = new Enemy("left", 
                               "car.png", 
                               frenemyp1l5,
                               speedfast);
    Frenemy enemy2lane5 = new Enemy("left",
                               "car.png", 
                               frenemyp2l5, 
                               speedfast);
    Enemy enemy3lane5 = new Enemy("left",
                               "car.png", 
                               frenemyp3l5, 
                               speedfast);
    Frenemy enemy4lane5 = new Enemy("left", 
                               "car.png",
                               frenemyp4l5, 
                               speedfast);
    
    
    
    // Sample Frenemy: Friend *******************
    // for stream1
    Frenemy friend1stream1 = new Friend("right",
                               "log.png",
                               frenemyp1s1,
                               speedslow);
    Frenemy friend2stream1 = new Friend("right",
                               "log.png", 
                               frenemyp2s1, 
                               speedslow);
    Frenemy friend3stream1 = new Friend("right", 
                               "log.png", 
                               frenemyp3s1,
                               speedslow);
    Frenemy friend4stream1 = new Friend("right",
                               "log.png",
                               frenemyp4s1,
                               speedslow);
    
    // for stream2
    Frenemy friend1stream2 = new Friend("left",
                               "turtle.png", 
                               frenemyp1s2,
                               speedslow);
    Frenemy friend2stream2 = new Friend("left", 
                               "turtle.png",
                               frenemyp2s2, 
                               speedslow);
    Frenemy friend3stream2 = new Friend("left",
                               "turtle.png", 
                               frenemyp3s2, 
                               speedslow);
    Frenemy friend4stream2 = new Friend("left",
                               "turtle.png",
                               frenemyp4s2, 
                               speedslow);
    
    // for stream3
    Frenemy friend1stream3 = new Friend("right",
                               "log.png",
                               frenemyp1s3, 
                               speedfast);
    Frenemy friend2stream3 = new Friend("right", 
                               "log.png",
                               frenemyp2s3,
                               speedfast);
    Frenemy friend3stream3 = new Friend("right",
                               "log.png", 
                               frenemyp3s3, 
                               speedfast);
    Frenemy friend4stream3 = new Friend("right",
                               "log.png",
                               frenemyp4s3, 
                               speedfast);
    
    // for stream4
    Frenemy friend1stream4 = new Friend("left",
                               "turtle.png",
                               frenemyp1s4,
                               speedfast);
    Frenemy friend2stream4 = new Friend("left",
                               "turtle.png",
                               frenemyp2s4, 
                               speedfast);
    Frenemy friend3stream4 = new Friend("left",
                               "turtle.png",
                               frenemyp3s4,
                               speedfast);
    Frenemy friend4stream4 = new Friend("left",
                               "turtle.png",
                               frenemyp4s4,
                               speedfast);
    
    // for stream5
    Frenemy friend1stream5 = new Friend("right",
                               "log.png",
                               frenemyp1s5, 
                               speedfast);
    Frenemy friend2stream5 = new Friend("right",
                               "log.png",
                               frenemyp2s5,
                               speedfast);
    Frenemy friend3stream5 = new Friend("right",
                               "log.png", 
                               frenemyp3s5,
                               speedfast);
    Frenemy friend4stream5 = new Friend("right",
                               "log.png",
                               frenemyp4s5,
                               speedfast);
    
    //unused friends/enemy for tests
    Frenemy friend1 = new Friend("left",
                                "turtle.png",
                                 new Point (250, 250), 
                                  speedslow);
    
    Frenemy friend2 = new Friend("right",
                                 "turtle.png",
                                 new Point (250, 250), 
                                    speedslow);
    
    Frenemy enemy1 = new Enemy("left",
                              "car.png",
                              new Point (250, 250), 
                                 speedslow);

    Frenemy enemy2 = new Enemy("right",
                               "car.png",
                               new Point (250, 250), 
                                speedslow);
     
    
    
    // Sample ArrayList of Frenemy ***********************************
    ArrayList<Frenemy> flistenemy;
    ArrayList<Frenemy> flistfriend;
    ArrayList<Frenemy> bslist;
    
    
    // Sample Frogger *************************************
    
    Frogger deadfrogger;
    Frogger outfrogger;
    Frogger safefrogger;
    Frogger winfrogger;
    Frogger inlavafrogger;
    Frogger onturtlefrogger;
    
    //Sample background ***********************************
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
    
    WorldImage w = background.overlayImages(
            new TextImage(new Point(30, 10), "Lives: " + 
                    3, 10, Color.MAGENTA));
    
    
    
    // reset the frenemies data
    public void reset() {
        
        // collide frog point
        deadfrogp = new Point(250, 250);
        
        // out of bounds frog point
        outfrogp = new Point(500, 50);
        
        // safe frog point
        safefrogp = new Point(width / 2, 50);
        
        // win frog point
        winfrogp = new Point(200, 1300);
        
        // inlava frog point
        inlavafrogp = new Point(150, stream1);
        
        // onturtle frog point
        onturtlefrogp = new Point(100, stream1); 
        
        deadfrog = new Frog("left", "frog.png", deadfrogp);
        
        outfrog = new Frog("up", "frog.png", outfrogp);
        
        safefrog = new Frog("pudding", "frog.png", safefrogp);
        
         winfrog = new Frog("up", "frog.png", winfrogp);

         inlavafrog = new Frog("down", "frog.png", inlavafrogp);

         onturtlefrog = new Frog("down", "frog.png", onturtlefrogp);
        
        flistenemy = new ArrayList<Frenemy> ();
        flistfriend = new ArrayList<Frenemy> ();
        bslist = new ArrayList<Frenemy> ();
        
        
        
        
        // These frogger have empty alllist
        deadfrogger = new Frogger(deadfrog, flistenemy, flistfriend, 0);
        outfrogger = new Frogger(outfrog, flistenemy, flistfriend, 3);
        safefrogger = new Frogger(safefrog, flistenemy, flistfriend, 3);
        winfrogger = new Frogger(winfrog, flistenemy, flistfriend, 3);
        inlavafrogger = new Frogger(inlavafrog, flistenemy, flistfriend, 3);
        onturtlefrogger = new Frogger(onturtlefrog, flistenemy, flistfriend, 3);
        
    }
    
    
    
    // Initialize the frenemies data
    public void init() {
        
        flistenemy.add(enemy1lane1);
        flistenemy.add(enemy2lane1);
        flistenemy.add(enemy3lane1);
        flistenemy.add(enemy4lane1);
      
        flistenemy.add(enemy1lane2);
        flistenemy.add(enemy2lane2);
        flistenemy.add(enemy3lane2);
        flistenemy.add(enemy4lane2);
        
        flistenemy.add(enemy1lane3);
        flistenemy.add(enemy2lane3);
        flistenemy.add(enemy3lane3);
        flistenemy.add(enemy4lane3);
        
        flistenemy.add(enemy1lane4);
        flistenemy.add(enemy2lane4);
        flistenemy.add(enemy3lane4);
        flistenemy.add(enemy4lane4);
        
        flistenemy.add(enemy1lane5);
        flistenemy.add(enemy2lane5);
        flistenemy.add(enemy3lane5);
        flistenemy.add(enemy4lane5);
        
        flistfriend.add(friend1stream1);
        flistfriend.add(friend2stream1);
        flistfriend.add(friend3stream1);
        flistfriend.add(friend4stream1);
      
        flistfriend.add(friend1stream2);
        flistfriend.add(friend2stream2);
        flistfriend.add(friend3stream2);
        flistfriend.add(friend4stream2);
        
        flistfriend.add(friend1stream3);
        flistfriend.add(friend2stream3);
        flistfriend.add(friend3stream3);
        flistfriend.add(friend4stream3);
        
        flistfriend.add(friend1stream4);
        flistfriend.add(friend2stream4);
        flistfriend.add(friend3stream4);
        flistfriend.add(friend4stream4);
        
        flistfriend.add(friend1stream5);
        flistfriend.add(friend2stream5);
        flistfriend.add(friend3stream5);
        flistfriend.add(friend4stream5);
        
        bslist.add(new Enemy("left",
                               "car.png", 
                               new Point(405, 50), 
                               speedfast));
        
        // update the alllist in the Frogger
        deadfrogger = new Frogger(deadfrog, flistenemy, flistfriend, 0);
        outfrogger = new Frogger(outfrog, flistenemy, flistfriend, 3);
        safefrogger = new Frogger(safefrog, flistenemy, flistfriend, 3);
        winfrogger = new Frogger(winfrog, flistenemy, flistfriend, 3);
        
    }
    
    // test all the methods in Frogger and associated classes
    public void testAll(Tester t) {
        
    	 reset();
    	 init();
    	 
        
        // POINT CLASS ********************************************************
        
        
        
        // collide 
        t.checkExpect(deadfrogp.collide(deadfrogp), true);
        t.checkExpect(deadfrogp.collide(safefrogp), false);
       
   	     
        // disTo
        t.checkExpect(deadfrogp.disTo(safefrogp), 
                safefrogp.disTo(deadfrogp));
        t.checkExpect(safefrogp.disTo(deadfrogp),
                Math.sqrt(42500));
        
        // move
        safefrogp.move(5, "right");
        t.checkExpect(safefrogp, new Point(205, 50));
        
        safefrogp.move(5, "left");
        t.checkExpect(safefrogp, new Point(200, 50));
        
        deadfrogp.move(15, "right");
        t.checkExpect(deadfrogp, new Point(265, 250));
        
        deadfrogp.move(15, "left");
        t.checkExpect(deadfrogp, new Point(250, 250));
        
           
      
        
        // FROG CLASS *********************************************************
        
        // image
        t.checkExpect(safefrog.image(),
                new FromFileImage(safefrogp, "frog.png"));
        t.checkExpect(deadfrog.image(),
                new FromFileImage(deadfrogp, "frog.png"));
        
        // changeDir
        safefrog.changeDir("left");
        t.checkExpect(safefrog.dir.equals("left"), true);
        
        safefrog.changeDir("up");
        t.checkExpect(safefrog.dir.equals("up"), true);
        
        
        reset();
        init();
        
        t.checkExpect(safefrog.dir.equals("up"), false);
        
        //changePos
        safefrog.changePos();
        t.checkExpect(safefrog.dir, "pudding");
        
        deadfrog.changePos();
        t.checkExpect(deadfrog, new Frog(deadfrog.dir,
                                         deadfrog.imagename, 
                                         new Point(245, 250)));
        
        deadfrog.changeDir("up");
        deadfrog.changePos();
        t.checkExpect(deadfrog, new Frog(deadfrog.dir,
                deadfrog.imagename, 
                new Point(245, 200)));
        
        deadfrog.changeDir("down");
        deadfrog.changePos();
        t.checkExpect(deadfrog, new Frog(deadfrog.dir,
                deadfrog.imagename, 
                new Point(245, 250)));
        
        deadfrog.changeDir("right");
        deadfrog.changePos();
        t.checkExpect(deadfrog, new Frog(deadfrog.dir,
                deadfrog.imagename, 
                new Point(250, 250)));
        
        reset();
        init();
        
        
        // OUTOFBOUNDS CLASS **************************************************
        
        
        
        // question
        t.checkExpect(out.question(enemy1lane1, 400, 600), false);
        t.checkExpect(out.question(friend4stream5, 400, 600), true);
        
        
        
        // OUTOFBOUNDSFROG CLASS **********************************************
        
        
        
        // question
        t.checkExpect(out2.question(new Frog("left",
                                             "frog.png",
                                             new Point(500, 20)),
                                             400, 600), true);
        t.checkExpect(out2.question(deadfrog, 400, 600), false);
        
        
        
        // FRENEMY CLASS ******************************************************
        
        
        
        // collide for enemy
        t.checkExpect(enemy3lane2.collide(new Frog("left",
                                            "frog.png",
                                            new Point(255, lane2))), true);
        
        t.checkExpect(enemy3lane3.collide(new Frog("left",
                                            "frog.png",
                                            new Point(255, lane2))), false);
        
        
        // collide for friend
        t.checkExpect(friend1stream2.collide(deadfrog), false);
        
        t.checkExpect(friend1stream2.collide(new Frog("right",
                                            "frog.png",
                                             new Point(30, 402))), true);
        
        
        // image
        t.checkExpect(enemy4lane3.image(), 
                new FromFileImage(enemy4lane3.loc, enemy4lane3.imagename));
        t.checkExpect(friend2stream5.image(),
                new FromFileImage(friend2stream5.loc,
                        friend2stream5.imagename));
        
        
        
        // move for enemy
        enemy1lane4.move();
        t.checkExpect(enemy1lane4, new Enemy(enemy1lane4.dir, 
                                      enemy1lane4.imagename,
                                      new Point(31, lane4),
                                      enemy1lane4.speed));
        
        enemy2lane3.move();
        t.checkExpect(enemy2lane3, new Enemy(enemy2lane3.dir, 
                enemy2lane3.imagename,
                new Point(98, lane3),
                enemy2lane3.speed));
        
        
        
        //move for friend
        friend4stream4.move();
        t.checkExpect(friend4stream4, new Friend(friend4stream4.dir,
                                       friend4stream4.imagename,
                                       new Point(354, stream4), 
                                       friend4stream4.speed));
        
        friend3stream3.move();
        t.checkExpect(friend3stream3, new Friend(friend3stream3.dir,
                                       friend3stream3.imagename,
                                       new Point(202, stream3), 
                                       friend3stream3.speed));
        
        
        
        //resetLoc for enemy
        enemy1.resetLoc(400);
        t.checkExpect(enemy1, new Enemy(enemy1.dir,
                enemy1.imagename,
                new Point(400, 250), 
                enemy1.speed));
        
        enemy2.resetLoc(400);
        enemy2.resetLoc(400);
        t.checkExpect(enemy2, new Enemy(enemy2.dir,
                enemy2.imagename,
                new Point(0, 250), 
                enemy2.speed));
        
        
        
        //resetLoc for friend
        
        friend1.resetLoc(400);
        t.checkExpect(friend1, new Friend(friend1.dir,
                friend1.imagename,
                new Point(400, 250), 
                friend1.speed));
        
        friend2.resetLoc(400);
        friend2.resetLoc(400);
        t.checkExpect(friend2, new Friend(friend2.dir,
                friend2.imagename,
                new Point(0, 250), 
                friend2.speed));
        
        
        // bad enemy - wrong direction
        Frenemy bad = new Enemy("up", 
                 "car.png", new Point(50, 50), speedslow);
        
        bad.move();
        t.checkExpect(bad, bad);
        
     // bad friend - wrong direction
        Frenemy bad2 = new Enemy("up", 
                 "log.png", new Point(150, 150), speedfast);
        
        bad2.move();
        t.checkExpect(bad2, bad2);
       
       
        //FROGGER CLASS *******************************************************
        
        // makeImage
        t.checkExpect(new Frogger(safefrog,
                                  new ArrayList<Frenemy> (),
                                  new ArrayList<Frenemy> (), 3).makeImage(), 
                                  w.overlayImages(safefrog.image()));
      
        
        // onKeyEvent
        reset();
        init();
        safefrogger.onKeyEvent("left");
        t.checkExpect(safefrogger.froggy, new Frog("left",
                                                   "frog.png",
                                                   new Point(195, 50)));
        
        safefrogger.onKeyEvent("up");
        t.checkExpect(safefrogger.froggy, new Frog("up",
                "frog.png",
                new Point(195, 0)));
        

        //inLava
        t.checkExpect(inlavafrogger.inLava(inlavafrogger.friends, 0), true);
        t.checkExpect(onturtlefrogger.inLava(onturtlefrogger.friends, 0),
                false);
        
        
        
        // onTickEnemy
        
        // a car is going out of bounds
        t.checkExpect(deadfrogger.enemies.get(8), 
                new Enemy("left", "car.png",
                        new Point(0, lane3), speedfast));
        // frog is going to die
        t.checkExpect(deadfrogger.froggy, 
                 new Frog("left", "frog.png", deadfrogp));
        
        // the frog collides with enemy and is reset
        deadfrogger.onTickEnemy(out);
        t.checkExpect(deadfrogger.froggy, 
                new Frog("left", "frog.png", new Point(200, 50)));
        
        // the frog is now safe and the out of bound enemy
        // is reset in the correct position
        t.checkExpect(deadfrogger.enemies.get(8),
                new Enemy("left", "car.png", 
                        new Point(width, lane3), speedfast));
        
         
        
        
        //onTickFriend
        
        // a friend is going out of bounds
        t.checkExpect(inlavafrogger.friends.get(19),
                new Friend("right", "log.png", 
                        new Point(401, 550), speedfast));
        
        
        //the frog is going to die
        t.checkExpect(inlavafrogger.froggy, 
                new Frog("down", "frog.png", inlavafrogp));
        
        // frog is in lava and is reset
        inlavafrogger.onTickFriend(out);
        t.checkExpect(inlavafrogger.froggy, 
                new Frog("down", "frog.png", new Point (200, 50)));
        
        
        
        // the frog is now safe and the out of bound enemy
        // is reset in the correct position
        t.checkExpect(inlavafrogger.friends.get(19),
                new Friend("right", "log.png", 
                        new Point(0, 550), speedfast));
        
        //the frog is going to move with turtle
        t.checkExpect(onturtlefrogger.froggy, 
                new Frog("down", "frog.png", new Point (100, 350)));
        
        
       //the frog is moving with the turtle
       onturtlefrogger.onTickFriend(out);
       t.checkExpect(onturtlefrogger.froggy, 
               new Frog("down", "frog.png", new Point (101, 350)));
       
        //onTick
        
        //a frog is going out of bounds
        t.checkExpect(outfrogger.froggy, 
                new Frog("up", "frog.png", outfrogp));
        
        //reset the frog which is out of bound
        outfrogger.onTick();
        t.checkExpect(outfrogger.froggy, 
                new Frog("up", "frog.png", new Point(200, 50)));
        
        
        
        
        
        
        
        
        // worldEnds
        reset();
        init();
        t.checkExpect(deadfrogger.worldEnds(), 
                new WorldEnd(true,  
                             new TextImage(new Point(250, 250),
                                           "You're Dead!",
                                           Color.red)));
        t.checkExpect(safefrogger.worldEnds(), 
                new WorldEnd(false, safefrogger.makeImage()));
        t.checkExpect(winfrogger.worldEnds(), 
               new WorldEnd(true,
                            new TextImage(new Point(250, 250),
                                         "You Won!",
                                          Color.green)));
        
   
        t.checkExpect(deadfrogger.worldEnds(), 
                new WorldEnd(true,
                             new TextImage(new Point(250, 250),
                                           "You're Dead!",
                                           Color.red)));
        t.checkExpect(safefrogger.worldEnds(), 
                new WorldEnd(false, safefrogger.makeImage()));
        t.checkExpect(winfrogger.worldEnds(), 
                new WorldEnd(true,
                             new TextImage(new Point(250, 250),
                                           "You Won!",
                                           Color.green)));
        
        // lastImage
 
        t.checkExpect(safefrogger.lastImage(""), 
                safefrogger.makeImage().overlayImages(
                        new TextImage(new Posn(200, 300), "", Color.black)));
        
      
        t.checkExpect(safefrogger.lastImage(""), 
                safefrogger.makeImage().overlayImages(
                        new TextImage(new Posn(200, 300), "", Color.black)));
     
        
    }
    
   /*
    // run the ticky-tack game
    void testWholeWorld(Tester t) {
      this.safefrogger.bigBang(width, height, .1);
    }


    public static void main(String[] argv) {
    Examples ett = new Examples();

    Tester.runReport(ett, false, false);
    }
    */
}

