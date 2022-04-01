package single;

public class SingleTon01 {
    public static void main(String[] args) {
//        GirlFd mary = new GirlFd("mary");
        GirlFd instance = GirlFd.getInstance();
        System.out.println(instance);
        GirlFd instance1 = GirlFd.getInstance();
        System.out.println(instance1);
    }
}
class GirlFd{
    private String name;
    //类内部创建对象
    private static GirlFd gf = new GirlFd("mary");
//构造器私有化
    private GirlFd(String name) {
        this.name = name;
    }
    //提供一个公共静态方法返回对象
    public static GirlFd getInstance(){
        return gf;
    }
}