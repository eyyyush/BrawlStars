import processing.core.PApplet;
import processing.core.PImage;

import java.security.Key;
import java.util.ArrayList;


public class Game extends PApplet {
    // TODO: declare game variables
    private Shelly shelly;
    private Colt colt;
    private Bullet b;

    private ArrayList<Bullet> shellyList = new ArrayList<>();
    private ArrayList<Bullet> coltList = new ArrayList<>();

    boolean sup, sdown, sleft, sright;
    boolean cup, cdown, cleft, cright;

    private PImage background;

    private PImage shellyImg;

    private PImage preetham;

    public void settings() {
        size(800, 800);   // set the window size

    }

    public void setup() {
        // TODO: initialize game variables
        shelly = new Shelly();
        colt = new Colt();
        shelly.setX(0);
        shelly.setY(800);
        colt.setX(800);
        colt.setY(0);
        b = new Bullet(shelly.getX(), shelly.getY());
        background = loadImage("images/brawl1.png");
        shellyImg = loadImage("images/shelly1.png");
        preetham = loadImage("images/preetham.png");
    }

    /***
     * Draws each frame to the screen.  Runs automatically in a loop at frameRate frames a second.
     * tick each object (have it update itself), and draw each object
     */
    public void draw() {
        //background(222, 60, 16);
        // paint screen white
        background(background);
        fill(0, 255, 0);          // load green paint color
     ///   ellipse(40, 760, 60, 60);  // draw circle at mouse loc
       // ellipse(760, 40, 60, 60);
        rect(125, 175, 100, 100);
        rect(600, 250, 100, 100);
        rect(400, 500, 100, 100);

        shelly.draw(this, shellyImg);
        colt.draw(this);
        //  System.out.println(shelly.getY());
        if (keyPressed) {
            if (sup == true) {
                shelly.up(10);
                System.out.println(shelly.getY());
                shelly.setXspeed(0);
            }

            if (sdown == true) {
                shelly.down(10);
                shelly.setXspeed(0);

            }
            if (sleft == true) {
                shelly.left(10);
                shelly.setYspeed(0);
            }
            if (sright == true) {
                shelly.right(10);
                shelly.setYspeed(0);

            }

            if (sright == true && sup == true) {
                shelly.diagonalRightUp(1);
            }

            if (sright == true && sdown == true) {
                shelly.diagonalRightDown(1);
            }
            if (sleft == true && sdown == true) {
                shelly.diagonalLeftDown(1);
                ;
            }
            if (sleft == true && sup == true) {
                shelly.diagonalLeftUp(1);
            }

            if (cup == true) {
                colt.up(10);
                colt.setXspeed(0);
            }

            if (cdown == true) {
                colt.down(10);
                colt.setXspeed(0);

            }
            if (cleft == true) {
                colt.left(10);
                colt.setYspeed(0);
                System.out.println(colt.getX());

            }
            if (cright) {
                colt.right(10);
                colt.setYspeed(0);
                System.out.println(colt.getX());

            }
            if (cright == true && cup == true) {
                colt.diagonalRightUp(1);
            }

            if (cright == true && cdown == true) {
                colt.diagonalRightDown(1);
            }
            if (cleft == true && cdown == true) {
                colt.diagonalLeftDown(1);
                ;
            }
            if (cleft == true && cup == true) {
                colt.diagonalLeftUp(1);
            }


        }

        //  for (int i = 0; i < b.size(); i++) {
        //     Bullet a = new Bullet(shelly.getX(), shelly.getY());
        //   b.add(a);
        //}

        /*if (mousePressed) {
            b.draw(this);
        }
        b.draw(this);*/
        int shellyXspeed = shelly.getXspeed();
        int shellyYspeed = shelly.getYspeed();
        int coltXspeed = colt.getXspeed();
        int coltYspeed = colt.getYspeed();

        for (int i = 0; i < shellyList.size(); i++) {
            Bullet b = shellyList.get(i);
            b.draw(this);
            b.update(this);
            if (colt.checkForCollistion(b)) {
                shellyList.remove(b);
                colt.hit();
                System.out.println(colt.getHealth());
            }
        }
        for (int i = 0; i < coltList.size(); i++) {
            Bullet b = coltList.get(i);
            b.draw(this);
            b.update(this);
            if (shelly.checkForCollistion(b)) {
                coltList.remove(b);
                shelly.hit();
                System.out.println(shelly.getHealth());
            }
        }
       /* for (Bullet b : shellyList) {
            b.draw(this);
            b.update(this);
          if(  colt.checkForCollistion(b)){
              shellyList.remove(b);
          }
        }*/

        if (colt.health <= 0) {
            fill(0);
          //  rect(0, 0, 800, 800);
            image(preetham, 0, 0);
            fill(0);
            textSize(75);
            //textMode(0);
            text("Game Over\nShelly Wins", 200, 550);
        }
            if (shelly.health <= 0) {
                fill(0);
              //  rect(0, 0, 800, 800);
                image(preetham, 0, 0);

                fill(0);
                textSize(75);
                //textMode(0);
                text("Game Over\nColt Wins", 200, 550);


            }





/*for (Bullet b : shellyList) {
            b.setSpeed(shellyXspeed, shellyYspeed);
            b.update(this);
        }
        for (Bullet b : coltList) {
            b.setSpeed(coltXspeed, coltYspeed);
            b.update(this);
        }
*/

    }

    public void keyPressed() {
        if (key == 'a') sleft = true;
        if (key == 'w') sup = true;
        if (key == 's') sdown = true;
        if (key == 'd') sright = true;


        /*if (key == CODED) {
            if (keyCode == LEFT) cleft = true;
            if (keyCode == UP) cup = true;
            if (keyCode == DOWN) cdown = true;
            if (keyCode == RIGHT) cright = true;
        }
*/


        if (key == 'j') cleft = true;
        if (key == 'i') cup = true;
        if (key == 'k') cdown = true;
        if (key == 'l') cright = true;

        if (key == ' ') {
            Bullet b = new Bullet(shelly.getX(), shelly.getY());
            b.setSpeed(shelly.getXspeed(), shelly.getYspeed());
            shellyList.add(b);
        }

      /*  if (key == CODED) {
            if (keyCode == SHIFT) {
                Bullet b = new Bullet(colt.getX(), colt.getY());
                b.setSpeed(colt.getXspeed(), colt.getYspeed());
                coltList.add(b);
            }
*/


    }

    public void keyReleased() {
        if (key == 'a') sleft = false;
        if (key == 'w') sup = false;
        if (key == 's') sdown = false;
        if (key == 'd') sright = false;
        if (key == 'z') coltList.add(new Bullet(colt.getX(), colt.getY()));


      /*  if (key == CODED) {
            if (keyCode == LEFT) cleft = false;
            if (keyCode == UP) cup = false;
            if (keyCode == DOWN) cdown = false;
            if (keyCode == RIGHT) cright = false;
        }
        */
        if (key == 'j') cleft = false;
        if (key == 'i') cup = false;
        if (key == 'k') cdown = false;
        if (key == 'l') cright = false;
    }

    public void mousePressed() {

        //  b.setX(shelly.getX());
        //b.setY(shelly.getY());
        Bullet b = new Bullet(colt.getX(), colt.getY());
        b.setSpeed(colt.getXspeed(), colt.getYspeed());
        coltList.add(b);

    }


    public static void main(String[] args) {
        PApplet.main("Game");
    }

}


