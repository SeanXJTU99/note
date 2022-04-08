package hw;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        a.start();
        b.start();
    }
}
class A extends Thread{
    private boolean loop;
    @Override
    public void run() {
        while(loop){
            System.out.println((int)(Math.random()*100 )+ 1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
class B extends  Thread{
    private A a;
    private Scanner scanner = new Scanner(System.in);
    public B(A a){
        this.a  = a;
    }

    @Override
    public void run() {
                while(true){
                System.out.println("input :");
                char c= scanner.next().charAt(0);
                if(c == 'Q'){
                    a.setLoop(false);
                    System.out.println("b");break;
            }
        }
    }
}