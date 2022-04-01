package final_;

public class Final01 {
    public static void main(String[] args) {
        System.out.println(BB.n);
    }
}
final class A{
    public final double T = 0.09;
    public final double T_R;
    public final double T_R_X;
    public final static  double TAX = 0.09;
    public final static int TAX_R;
    static{
        TAX_R = 10;
    }
    public A(){
        T_R = 1.1;
    }
    {
        T_R_X = 10;
    }
}
class BB{
    public final static int n = 10;
    static {
        System.out.println("BBB");
    }
}