import processing.core.PApplet;

public class Colt extends Brawler{


    public Colt(){
        super(1,2,3);
    }

    public void draw (PApplet window){
        window.fill(255);
        window.ellipse(x, y, 60,60 );  // draw circle at mouse loc

    }

    public void update(PApplet window){
        window.ellipse(x, y, 60,60 );  // draw circle at mouse loc

    }

    public void keyReleased(){

    }
}
