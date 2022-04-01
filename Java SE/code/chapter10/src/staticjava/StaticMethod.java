package staticjava;

public class StaticMethod {
    public static void main(String[] args) {
        Stu tom = new Stu("tom");
        Stu jac = new Stu("jac");
        tom.payFee(100);//推荐使用Stu.payFee
        jac.payFee(200);
        Stu.showFee();
    }
}
class Stu{
    private String name;
    private static double fee = 0;
    public int n1 = 1;

    public Stu(String name) {
        this.name = name;
    }
    public static void payFee(double fee){
        Stu.fee += fee;
    }
    public static void showFee(){
        System.out.println("Fee = " + Stu.fee );
    }
}
