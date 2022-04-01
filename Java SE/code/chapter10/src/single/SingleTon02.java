package single;

public class SingleTon02 {
    public static void main(String[] args) {
        Cat instance = Cat.getInstance();
    }
}

//希望在程序中只创建一个Cat对象
class Cat{
    private String name;
    private static int n1 = 99;
    private  static Cat cat;//未创建对象，默认为null
    private Cat(String name) {
        this.name = name;
    }
    public static Cat getInstance(){
        if(cat==null){
            cat  = new Cat("c1");
        }
        return cat;
    }
}