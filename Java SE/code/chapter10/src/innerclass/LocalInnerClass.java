package innerclass;

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
    }
}
class Outer02{
    private int n1 = 100;
    private void m2(){}
    public void m1(){
        //局部内部类
        class Inner02{
            // 可以直接访问外部类所有成员
            private int n1 = 800;
            public void f1(){
                System.out.println("n1=" + Outer02.this.n1);
                m2();
            }
        }
        class Inner03 extends Inner02{}
        //外部类在方法中创建Inner对象，在调用方法
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }
}