import processing.core.PApplet;

public class Bullet {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

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

    public Bullet(int x, int y) {
        this.x = x;
        this.y = y;
    }



    public void draw(PApplet window) {
        window.fill(145);
        window.ellipse(x, y, 10, 10);

    }

    public void setSpeed(int brawlerx, int bralwery) {
        xSpeed = brawlerx/2;
        ySpeed = bralwery/2;

    }

    public void update(PApplet window) {

        x += xSpeed;
        y += ySpeed;// draw circle at mouse loc
    }

    public boolean colliding(int x, int y) {


        return true;
    }


}
