package draw;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame{ //画框
    private  MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
    }
    public DrawCircle(){
        //初始化面板
        mp =  new MyPanel();
        //面板放入窗口
        this.add(mp);
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

//定义MyPanel，继承JPanel
class MyPanel extends JPanel{  //面板
    @Override
    public void paint(Graphics g) {
        super.paint(g);
//        g.drawOval(0,0,100,100);
//        g.drawLine(10,10,100,100);
//        g.drawRect(10,10,100,100);
//        g.setColor(Color.CYAN);
//        g.fillRect(10,10,100,100);
//
//        g.setColor(Color.MAGENTA);
//        g.fillOval(10,10,200,100);

        //获取图片
        Image image = Toolkit.getDefaultToolkit().
                getImage(Panel.class.getResource("/memory.jpg"));
        g.drawImage(image,10,10,1319,742,this);

//        g.setColor(Color.GREEN);
//        g.setFont(new Font("隶书", Font.BOLD, 50));
//        g.drawString("hello world", 100,100);


    }
}