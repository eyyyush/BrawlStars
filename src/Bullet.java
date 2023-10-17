import processing.core.PApplet;

public class Bullet {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Bullet(int x, int y){
        this.x=x;
        this.y=y;
    }

    public void hitBrawler(Brawler b){

    }

    public void draw(PApplet window){
        window.fill(145);
        window.ellipse(x, y, 60,60 );  // draw circle at mouse loc
    }
}
