package innerclass;

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer10 outer10 = new Outer10();
        Outer10.Inner10 a = Outer10.getInner10();
        a.say();
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.say();

    }
}
class Outer10{
    private int n1 = 10;
    private static String name = "jack";
    public static class Inner10{
        public void say(){
            System.out.println(name);
        }
    }
    public static Inner10 getInner10(){
        return new Inner10();
    }
}
