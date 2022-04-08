package methods;

public class ThreadMethod {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.setName("1");
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();

        //main输出5个hi，然后中断休眠
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("hi" + i);

        }
        System.out.println(t.getName()+t.getPriority());
        t.interrupt();

    }
}
class T extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
        try {
            System.out.println(Thread.currentThread().getName()+ " sleeping");
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+ " interrupt");
        }
    }
}