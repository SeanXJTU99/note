package threaduse;

public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        //Cat对象当作线程使用
        Cat cat = new Cat();
        cat.start();
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 60; i++) {
            System.out.println(i);
            Thread.sleep(500);
        }
    }
}
//继承后该类就可以是线程
//Thread类是实现了Runnable接口的run方法
class Cat extends Thread{
    int times = 0;
    @Override
    public void run() {
        while(times<=80) {
            System.out.println("I'm miao miao" +
                    ++times + Thread.currentThread().getName());
            //修眠1000ms
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}