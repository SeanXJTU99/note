package interface_;

public class Interface01 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Computer c = new Computer();
        c.work(phone);//手机接入电脑
    }
}
