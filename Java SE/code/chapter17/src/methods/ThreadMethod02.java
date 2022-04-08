package methods;

public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException{
        T2 t2 = new T2();
        t2.start();
        for (int i = 0; i < 20; i++) {
            Thread.sleep(1000);
            System.out.println("main" + i);
            if(i==5){
                System.out.println("thread0 first");
//                t2.join();
                Thread.yield();
            }
        }
    }
}
class T2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}