package syn;

public class DeadLock {
    public static void main(String[] args) {
        DeadLockDemo a = new DeadLockDemo(true);
        DeadLockDemo b = new DeadLockDemo(false);
        a.start();
        b.start();

    }

}
class DeadLockDemo extends Thread{
    static Object o1 = new Object();
    static Object o2 = new Object();
    boolean flag;
    public DeadLockDemo(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if(flag){
            synchronized (o1){//对象互斥锁，得不到o2，阻塞状态，也无法释放o1的资源
                System.out.println("1");
                synchronized (o2){
                    System.out.println("2");
                }
            }
        }else {
            synchronized (o2){
                System.out.println("2");
                synchronized (o1){
                    System.out.println("1");
                }
            }
        }
    }
}
