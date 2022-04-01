package innerclass;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
    }
}
class Outer05{
    private int n1 =99;
    public void f1(){
        Person p =new Person(){//匿名内部类本身也是返回对象
            private int n1 = 88;
            @Override
            public void hi() {
                System.out.println("hi chongxie" + n1 + Outer05.this.n1);
            }

            @Override
            public void ok(String str) {
                super.ok(str);
            }
        };
        p.ok("hello");
        p.hi();
        //动态绑定
    }
}
class Person{
    public void hi(){
        System.out.println("Person h1()");
    }
    public void ok(String str){
        System.out.println("Person ok()" + str);
    }
}