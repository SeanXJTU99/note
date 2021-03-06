package hw;

/*
输入形式为 Liu Yu Kai 以 Kai,Liu. Y 形式打印
例如 Willian Jefferson Clinton 输出为 Clinton,Willian.J
 */
public class Homework03 {
    public static void main(String[] args) {
        String name = "Willian Jefferson Clinton";
        printName(name);
    }
    /*

     */
    public static void  printName(String str){
        //对输入字符串按照空格分隔 split(" ")
        //对得到的String[] 格式化
        //输入校验
        if(str == null){
            System.out.println("null");
            return;
        }

        String[] names = str.split(" ");
        if(names.length != 3){
            System.out.println("string format error");
            return;
        }
        String format = String.format("%s,%s .%c",names[2],names[0],names[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
