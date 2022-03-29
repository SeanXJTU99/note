//package的作用是声明当前类所在的包，要放在所有类的最上面，一个类最多一个package
package com.sean.pkg;
//import 放在package下面，类定义之前，没有顺序要求
import java.util.Arrays;
import java.util.Scanner;
public class PkgDetail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = {{0, 1,-1},{0,2,-2},{0,3,-3}};
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t\t ");
            }
            System.out.println();
        }
//        Arrays.sort(arr);
//        for (int j : arr) System.out.println(j + " ");
        int m;
        double n, sum;
        while(scanner.hasNext()){
            n = scanner.nextInt();
            m =scanner.nextInt();
            sum = 0;
            for (int i = 0; i < m; i++) {
                sum += n;
                n = Math.sqrt(n);

            }
            System.out.printf("%.2f", sum);
            System.out.println();
        }
    }
}
