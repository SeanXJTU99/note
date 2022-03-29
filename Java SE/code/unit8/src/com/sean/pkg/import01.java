package com.sean.pkg;


import java.util.Arrays;

public class import01 {
    public static void main(String[] args) {
        int[] arr = {-1, 20, 3, 13, 3};
        //传统方法时自己编写排序算法
        //
        Arrays.sort(arr);
        for (int j : arr) {
            System.out.print(j + "\t");
        }
    }
}
