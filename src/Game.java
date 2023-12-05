import processing.core.PApplet;
import processing.core.PImage;

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

    }

    /***
     * Draws each frame to the screen.  Runs automatically in a loop at frameRate frames a second.
     * tick each object (have it update itself), and draw each object
     */
    public void draw() {
        background(222, 60, 16);    // paint screen white
        fill(0, 255, 0);          // load green paint color
        ellipse(40, 760, 60, 60);  // draw circle at mouse loc
        ellipse(760, 40, 60, 60);
        rect(125, 175, 100, 100);
        rect(600, 250, 100, 100);
        rect(400, 500, 100, 100);

        shelly.draw(this);
        colt.draw(this);
        //  System.out.println(shelly.getY());
        if (keyPressed) {
            if (sup == true) {
                shelly.up(10);
                System.out.println(shelly.getY());
            }

            if (sdown == true) {
                shelly.down(10);

            }
            if (sleft == true) {
                shelly.left(10);
            }
            if (sright == true) {
                shelly.right(10);
            }
            if (cup == true) {
                colt.up(10);
                System.out.println(colt.getY());


            }

            if (cdown == true) {
                colt.down(10);
                //  System.out.println(colt.getY());

            }
            if (cleft == true) {
                colt.left(10);
                System.out.println(colt.getX());

            }
            if (cright) {
                colt.right(10);
                System.out.println(colt.getX());

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

        for (Bullet b : shellyList) {
            b.draw(this);
        }


        for (Bullet b : coltList) {
            b.draw(this);
        }




    }

    public void keyPressed() {
        if (key == 'a') sleft = true;
        if (key == 'w') sup = true;
        if (key == 's') sdown = true;
        if (key == 'd') sright = true;


        if (key == CODED) {
            if (keyCode == LEFT) cleft = true;
            if (keyCode == UP) cup = true;
            if (keyCode == DOWN) cdown = true;
            if (keyCode == RIGHT) cright = true;
        }

    }

    public void keyReleased() {
        if (key == 'a') sleft = false;
        if (key == 'w') sup = false;
        if (key == 's') sdown = false;
        if (key == 'd') sright = false;
        if (key == 'z') coltList.add(new Bullet(colt.getX(), colt.getY()));


        if (key == CODED) {
            if (keyCode == LEFT) cleft = false;
            if (keyCode == UP) cup = false;
            if (keyCode == DOWN) cdown = false;
            if (keyCode == RIGHT) cright = false;
        }
    }

    public void mousePressed() {


        //  b.setX(shelly.getX());
        //b.setY(shelly.getY());

        shellyList.add(new Bullet(shelly.getX(), shelly.getY()));
    }


    public static void main(String[] args) {
        PApplet.main("Game");
    }

}


