package innerclass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}
class Outer04{
    private int n1 = 10;
    public void method(){
        //想使用A接口
        //传统方法：写一个类，实现接口，并创建对象
        //若tiger只使用一次，资源浪费，而且需要不断地写类

        //tiger编译类型是A，运行类型是匿名内部类Outer04$1
        //jdk底层创建匿名内部类outer$1，立即创建一个实例，并把地址返回给对象tiger
        //匿名内部类Outer04$1只使用一次，
        A tiger = new A(){
            @Override
            public void cry() {
                System.out.println("tiger cry");
            }
        };
        //但tiger对象可以一直重复使用
        tiger.cry();
        tiger.cry();
        tiger.cry();
//        A tiger = new Tiger();
//        tiger.cry();


        //基于类的匿名内部类
        /*
           底层
           class Outer04$2 extends Father{
                @Override
                public void test() {
                    System.out.println("匿名内部类重写了test方法");
                }
           }
         */
        //直接返回匿名内部类Outer04$2的对象
        //参数列表会传递给构造器
        Father father = new Father("jack"){
            //也可以不重写
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        System.out.println("father 运行类型=" + father.getClass());
        father.test();
        Father fa = new Father("tom");
        fa.test();
    }
}
interface A{
    void cry();
}
//class Tiger implements A{
//    @Override
//    public void cry() {
//        System.out.println("tiger crying");
//    }
//}

class Father{
    private String name;

    public Father(String name) {
        this.name = name;
    }
    public  void test(){
        System.out.println("name=" + name);
    }
}