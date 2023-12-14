import processing.core.PApplet;
import processing.core.PImage;

public class Shelly extends Brawler {


    public Shelly() {
        super(1, 2, 10);
    }

    public void draw(PApplet window, PImage img) {
        window.fill(0);
       // window.image(img, x,y);
        window.ellipse(x, y, 60, 60);  // draw circle at mouse loc
        window.fill(255);
        window.textSize(17);
        window.text("Shelly", x-20, y);



    }

    public void update(PApplet window) {
        window.ellipse(x, y, 60, 60);  // draw circle at mouse loc

    }

    public void keyReleased() {

    }




}
