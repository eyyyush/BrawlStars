import processing.core.PApplet;

public class Shelly extends Brawler{


    public Shelly(){
        super(1,2,3);
    }

    public void draw (PApplet window){
        window.fill(0);
        window.ellipse(x, y, 60,60 );  // draw circle at mouse loc

    }
public void update(PApplet window){
    window.ellipse(x, y, 60,60 );  // draw circle at mouse loc

}
    public void keyReleased() {

    }


}
