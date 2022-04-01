package exceptions;

public class Exception01 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 0;
        try {
            int res = n1 / n2;
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());//输出异常的出现原因
        }
        //程序抛出异常ArithmeticException
        //程序退出，崩溃了
        //这样不好，健壮性太差，一个不算致命的错误导致程序崩溃
        //利用java异常处理机制解决
        //使用try-catch
    }
}
