package tankgame03;

public class Hero extends Tank {
    Shot shot = null; //表示一个射击行为
    public Hero(int x, int y ,int speed) {
        super(x, y, speed);
    }
    public void shotEnemy(){
        switch (getDirect()){
            case 0:
                shot = new Shot(getX()+20, getY(),0);
                break;
            case 1:
                shot = new Shot(getX()+60, getY()+20,1);
                break;
            case 2:
                shot = new Shot(getX()+20, getY()+60, 2);
                break;
            case 3:
                shot = new Shot(getX(), getY()+20, 3);
                break;
        }
        new Thread(shot).start();
    }
}

