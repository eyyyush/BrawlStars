import processing.core.PApplet;
import processing.core.PImage;

public class Game extends PApplet {
    // TODO: declare game variables
    private Shelly shelly;
    private Colt colt;


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
            if (key == 'w') {
                shelly.up(10);
                System.out.println(shelly.getY());
            }

            if (key == 's') {
                shelly.down(10);

            }
            if (key == 'a') {
                shelly.left(10);
            }
            if (key == 'd') {
                shelly.right(10);
            }


            if (key == CODED) {
                if (keyCode == UP) {
                    colt.up(10);
                }

                if (keyCode == DOWN) {
                    colt.down(10);

                }
                if (keyCode == LEFT) {
                    colt.left(10);
                }
                if (keyCode == RIGHT) {
                    colt.right(10);
                }

            }


        }

    /*public void keyPressed() {
        if (key == 'w') {
            shelly.setY(10);
        }
        if (key=='a'){
            shelly.setX(50);
        }
  */
    }


        public static void main (String[]args){
            PApplet.main("Game");
        }

    }


