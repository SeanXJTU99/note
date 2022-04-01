package tankegame02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;
import java.util.Vector;

public class MyPanel  extends JPanel implements KeyListener {
    //定义我的坦克 初始化
    Hero hero = null;
    Vector<Enemy> enemyTanks = new Vector<>();
    int enemyTankSize = 3;
    public MyPanel(){
        hero = new Hero(100,100, 2);
        for (int i = 0; i < enemyTankSize; i++) {
            Enemy enemy = new Enemy(100*(i+1), 0, 2);
            enemy.setDirect(2);
            enemyTanks.add(enemy);
        }

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);

        //画出坦克
        drawTank(hero.getX(),hero.getY(),g, hero.getDirect(), 0);
//        drawTank(hero.getX()+60,hero.getY(),g, 3, 1);
//        drawTank(hero.getX()+100,hero.getY(),g, 0, 1);
        for (int i = 0; i < enemyTanks.size(); i++) {
            Enemy enemy = enemyTanks.get(i);
            drawTank(enemy.getX(),enemy.getY(),g,enemy.getDirect(), 1);
        }
    }

    //画坦克
    public  void drawTank(int x, int y, Graphics g, int direct, int type){
        switch(type){
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;
        }

        switch(direct){
            case 0:
                g.fill3DRect(x,y, 10,60,false);
                g.fill3DRect(x+30,y, 10,60,false);
                g.fill3DRect(x+10,y+10, 20,40,false);
                g.fillOval(x+10,y+20, 20,20);
                g.drawLine(x+20,y+30, x+20,y);
                break;
            case 1:
                g.fill3DRect(x,y,60,10,false);
                g.fill3DRect(x,y+30, 60,10,false);
                g.fill3DRect(x+10,y+10,40,20,false);
                g.fillOval(x+20,y+10,20,20);
                g.drawLine(x+30,y+20,x+60,y+20);
                break;
            case 2:
                g.fill3DRect(x,y, 10,60,false);
                g.fill3DRect(x+30,y, 10,60,false);
                g.fill3DRect(x+10,y+10, 20,40,false);
                g.fillOval(x+10,y+20, 20,20);
                g.drawLine(x+20,y+30, x+20,y+60);
                break;
            case 3:
                g.fill3DRect(x,y,60,10,false);
                g.fill3DRect(x,y+30, 60,10,false);
                g.fill3DRect(x+10,y+10,40,20,false);
                g.fillOval(x+20,y+10,20,20);
                g.drawLine(x+30,y+20,x,y+20);
                break;
            default:
                System.out.println("todo");
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_W){
            hero.setDirect(0);
            hero.moveUP();
        }else if(e.getKeyCode() == KeyEvent.VK_D){
            hero.setDirect(1);
            hero.moveRight();
        }else if(e.getKeyCode() == KeyEvent.VK_S){
            hero.setDirect(2);
            hero.moveDown();
        }else if(e.getKeyCode() == KeyEvent.VK_A){
            hero.setDirect(3);
            hero.moveLeft();
        }
        this.repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
