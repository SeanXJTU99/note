package enum_;

public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
    }
}
//1.构造器私有，防止创建新对象
//2.去除setter，防止属性被修改
//3.定义常量对象
class Season{
    private String name;
    private String desc;

    //定义了四个对象
    public final static Season SPRING = new Season("spring", "warm");
    public final static Season SUMMER = new Season("summer", "hot");
    public static final Season AUTUMN = new Season("autumn", "chilly");
    public static final Season WINTER = new Season("winter", "cold");

    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}