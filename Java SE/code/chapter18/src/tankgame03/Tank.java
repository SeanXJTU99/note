package tankgame03;

public class Tank {
    private int x;
    private int y;
    private int direct;
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void moveUP(){
        y-=speed;
    }
    public void moveDown(){
        y+=speed;
    }
    public void moveRight(){
        x+=speed;
    }
    public void moveLeft(){
        x-=speed;
    }
    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
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

    public void setY(int y) {
        this.y = y;
    }

    public Tank(int x, int y, int speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }
}

