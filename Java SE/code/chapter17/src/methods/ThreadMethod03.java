package methods;

public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException{
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();
        //当main结束，子线程自动结束
        //将子线程设为守护线程
        for (int i = 0; i <= 10; i++) {
            System.out.println("working");
            Thread.sleep(1000);
        }
    }
}
class MyDaemonThread extends Thread{
    @Override
    public void run() {
        for(;;){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("123");
        }
    }
}