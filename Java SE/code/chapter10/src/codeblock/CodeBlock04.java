package codeblock;

public class CodeBlock04 {
    public static void main(String[] args) {
        new B();
    }
}
class A{
    private static int a1 = getA1();
    static {
        System.out.println("AAA");
    }
    {
        System.out.println("AA");
    }
    public A(){
        System.out.println("A");
    }
    public static int getA1(){
        System.out.println("a");
        a1 = 10;
        return a1;
    }
}
class B extends A{
    private int b1 = getB1();
    static {
        System.out.println("BBB");
    }
    public B(){
        System.out.println("B");
    }
    public int getB1(){
        System.out.println("b");
        return b1 = 10;
    }

}