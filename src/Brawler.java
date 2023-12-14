import processing.core.PApplet;

public class Brawler {
    protected int x;
    protected int y;

    protected int xspeed;
    protected int yspeed;
    protected int health;

    public Brawler(int x, int y, int health) {
        this.x = x;
        this.y = y;
        this.health = health;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int a) {
        y = a;
    }

    public int getXspeed() {
        return xspeed;
    }

    public void setXspeed(int xspeed) {
        this.xspeed = xspeed;
    }

    public int getYspeed() {
        return yspeed;
    }

    public void setYspeed(int yspeed) {
        this.yspeed = yspeed;
    }

    public void down(int a) {
        if (y + a > 800) {
            y = 800;
        } else {
            this.y = y + a;
            yspeed = a;
        }
        // System.out.println(y);
    }

    public void up(int a) {
        if (y - a < 0) {
            y = 0;
        } else {
            y -= a;
            yspeed = -1 * a;

        }
    }

    public void left(int a) {
        if (x - a < 0) {
            x = 0;
        } else {
            x -= a;
            xspeed = -1 * a;
        }
    }

    public void right(int a) {
        if (x + a > 800) {
            x = 800;
        } else {
            x += a;
            xspeed = a;

        }
    }

    public void diagonalRightUp(int a) {
        right(a);
        up(a);
        xspeed = 10;
        yspeed = -10;
    }

    public void diagonalRightDown(int a) {
        right(a);
        down(a);
        xspeed = 10;
        yspeed = 10;
    }

    public void diagonalLeftUp(int a) {
        left(a);
        up(a);
        xspeed = -10;
        yspeed = -10;
    }

    public void diagonalLeftDown(int a) {
        left(a);
        down(a);
        xspeed = -10;
        yspeed = 10;

    }

    public int getHealth() {
        return health;
    }

    public void hit() {
        this.health = health - 1;
    }

    public void shoot() {


    }

    public void move() {

    }

    protected void update() {

    }

    public boolean checkForCollistion(Bullet b) {

        int xdist = Math.abs(this.x - b.getX());
        int ydist = Math.abs(this.y - b.getY());

        if (Math.sqrt(xdist * xdist + ydist * ydist) < 30) {
            return true;
        }
        return false;
    }

}
