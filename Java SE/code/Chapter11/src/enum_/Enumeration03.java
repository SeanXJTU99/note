package enum_;

public class Enumeration03 {
}
enum Season2{
    SPRING("spring", "warm"),SUMMER("summer", "hot"),
    AUTUMN("autumn", "chilly"),WINTER("winter","cold"),
    WHAT;
    private String name;
    private String desc;

    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
    private Season2(){}

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season2{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
