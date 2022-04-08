package syn;

public class SellTicket {

    public static void main(String[] args) {
//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//        //超卖了
//        sellTicket01.start();
//        sellTicket02.start();
//        sellTicket03.start();
//        SellTicket02 sellTicket02 = new SellTicket02();
//
//        new Thread(sellTicket02).start();
//        new Thread(sellTicket02).start();
//        new Thread(sellTicket02).start();
        //也会超卖
        SellTicket03 sellTicket03 = new SellTicket03();

        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();
    }
}

class SellTicket01 extends Thread {
    private static int ticketNum = 20;

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("sold out");
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "sold a ticket" +
                    "left " + (--ticketNum));
        }
    }
}

class SellTicket02 implements Runnable {
    private static int ticketNum = 20;

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("sold out");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "sold a ticket" +
                    "left " + (--ticketNum));
        }
    }
}

class SellTicket03 implements Runnable {
    private int ticketNum = 100;
    private boolean loop = true;

    Object object = new Object();
    public /*synchronized*/ void sell() {
        synchronized (/*this*/object) {
            if (ticketNum <= 0) {
                System.out.println("sold out");
                loop = false;
                return;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "sold a ticket" +
                    "left " + (--ticketNum));
        }
    }

    @Override
    public void run() {
        while (loop) {
            sell();
        }
    }
}