package enum_;

public class EnumMethod {
    public static void main(String[] args) {
        //以Season2演示Enum类的常用方法
        Season2 autumn = Season2.AUTUMN;
        //name输出对象名
        System.out.println(autumn.name());
        //ordinal输出对象次序
        System.out.println(autumn.ordinal());
        //values 返回定义的所有对象，数组
        Season2[] values = Season2.values();
        //遍历枚举类对象，增强for循环
        for(Season2 season: values){
            System.out.println(season);
        }
        //valueOf 字符串匹配枚举对象,找不到就报错
        Season2 autumn1 = Season2.valueOf("AUTUMN");
        System.out.println("autumn1 = " + autumn1);
        //compareTo比较两个枚举常量的编号,返回常量1编号-常量2编号
        System.out.println(Season2.AUTUMN.compareTo(Season2.SPRING));
    }
}
