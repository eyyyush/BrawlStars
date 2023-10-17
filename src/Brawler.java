import processing.core.PApplet;

public class Brawler {
    protected int x;
    protected int y;
    protected int health;
    public Brawler (int x, int y, int health){
        this.x=x;
        this.y=y;
        this.health=health;
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
    public void setY(int a){
        y=a;
    }

    public void down(int a) {
      if(y+a>800){
          y=800;
      }
      else {
          this.y = y + a;
      }
       // System.out.println(y);
    }

    public void up(int a){
        if(y-a<0){
            y=0;
        }
        else {
            y -= a;
        }
    }

    public void left(int a){
        if (x-a<0){
            x=0;
        }
        else {
            x -= a;
        }
    }

    public void right (int a){
        if(x+a>800){
            x=800;
        }
        else{
        x+=a;
        }
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void shoot(){


    }

    public void move(){

    }
    protected void update(){

    }


}
