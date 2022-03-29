package com.sean.pkg;
import com.sean.modifier.A;
public class Test {
    public static void main(String[] args) {
        A a = new A();
        //不能访问protected，默认，private
        System.out.println(a.n1);
        a.m1();//a.m2();a.m3();
    }
}
