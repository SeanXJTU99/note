package event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
小球通过键盘控制移动
 */
public class BallMove extends JFrame{
    MyPanel mp = null;

    public static void main(String[] args) {
        BallMove ballMove = new BallMove();

    }
    public BallMove(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        this.addKeyListener(mp);//监听面板上发生的键盘事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}

class MyPanel extends JPanel implements KeyListener {

    int x = 10;
    int y = 10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y,20,20);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //字符输出时出发
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //按键触发
//        System.out.println((char)e.getKeyCode() + "pressed");
        if(e.getKeyCode() == KeyEvent.VK_DOWN){
            y++;
        }else if(e.getKeyCode() == KeyEvent.VK_LEFT){
            x --;
        }else if(e.getKeyCode() == KeyEvent.VK_UP){
            y --;
        }else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            x++;
        }

        //重画面板
        this.repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {
        //松开按键触发

    }
}