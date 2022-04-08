package exit_;

public class ThreadExit {
    public static void main(String[] args) throws InterruptedException {
        T t1 = new T();
        t1.start();

        //若由main修改count，控制t1的终止
        //main休眠10秒再通知退出
        Thread.sleep(10*1000);
        t1.setLoop(false);
    }

}
class T extends Thread{
    private int count = 0;
    private boolean loop = true;
    @Override
    public void run() {
        while(loop) {
            System.out.println("hello world" + (++count));
            try {
                Thread.sleep(60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}