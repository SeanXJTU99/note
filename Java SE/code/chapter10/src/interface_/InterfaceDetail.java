package interface_;

public class InterfaceDetail {
    public static void main(String[] args) {
        LittleMonkey littleMonkey = new LittleMonkey();
        littleMonkey.fly();
        littleMonkey.swim();
        littleMonkey.climb();
    }
}
class Monkey{
    public void climb(){
        System.out.println("climbing");
    }
}

interface Fish{
    void swim();
}
interface Bird{
    void fly();
}
class LittleMonkey extends Monkey implements Fish,Bird{
    @Override
    public void swim() {
        System.out.println("swiming");
    }

    @Override
    public void fly() {
        System.out.println("flying");
    }
}