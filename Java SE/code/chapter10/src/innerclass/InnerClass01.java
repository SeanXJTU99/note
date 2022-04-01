package innerclass;

public class InnerClass01 {//外部其他类
    public static void main(String[] args) {

    }
}
class Outer{
    private int n1 = 100;//属性
    public void m1(){//方法
        System.out.println("m1");
    }
    {//代码块
        System.out.println("code block");
    }
    public Outer(int n1) {//构造器
        this.n1 = n1;
    }
    class Inner{

    }
}