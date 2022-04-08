package state_;

public class ThreadState_ {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        System.out.println(t.getName() + t.getState());
        t.start();
        while(Thread.State.TERMINATED != t.getState()){
            System.out.println(t.getName() + t.getState());
            Thread.sleep(1000);
        }
    }
}
class T extends Thread{
    @Override
    public void run() {
        while(true){
            for (int i = 0; i <10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }break;
        }
    }
}