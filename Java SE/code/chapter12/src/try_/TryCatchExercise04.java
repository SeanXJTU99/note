package try_;

import java.util.Scanner;

public class TryCatchExercise04 {
    public static void main(String[] args) {
        /*
            1.scanner
            2.创建无线循环接收输入
            3.将输入值转成int
            4.转换时抛出异常则继续
            5.没有异常break
         */
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        String next = "";
        while(true){
            System.out.println("input integer:");
            next = scanner.next();
            try {
                n = Integer.parseInt(next);//可能抛出异常
                break;
            } catch (NumberFormatException e) {
                System.out.println("input not integer");
            }
        }
        System.out.println(n);
    }
}
