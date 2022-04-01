package throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDetail {
    public static void main(String[] args) {
        f2();
    }

    public static void f2() /*throws ArithmeticException*/ {
        double res = 10 / 0;
    }
    public static void f1() throws FileNotFoundException{
        f3();//f3抛出编译异常，f1就必须显式的处理
    }
    public static void f3() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("d://aa.txt");
    }
    public static void f4(){
        f5();//f5抛出运行异常，不需要显式处理
    }
    public static void f5()throws ArithmeticException{
    }

}
class Father{
    public void method() throws RuntimeException{
    }
}
class Son extends Father{
    @Override
    public void method() throws NullPointerException {
    }
}