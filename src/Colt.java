import processing.core.PApplet;

public class Colt extends Brawler {


    public Colt() {
        super(1, 2, 10);
    }

    public void draw(PApplet window) {
        window.fill(255);
        window.ellipse(x, y, 60, 60);  // draw circle at mouse loc
        window.fill(0);
        window.textSize(17);
        window.text("Colt", x-20, y);

    }

    public void update(PApplet window) {
        window.ellipse(x, y, 60, 60);  // draw circle at mouse loc

    }

    public void keyReleased() {

    }
}
