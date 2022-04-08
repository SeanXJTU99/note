package tankgame03;

import javax.swing.*;


import javax.swing.*;

public class TankGame03 extends JFrame {
    MyPanel mp = null;

    public static void main(String[] args) {

        TankGame03 tankGame01 = new TankGame03();
    }
    public TankGame03(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000,750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}