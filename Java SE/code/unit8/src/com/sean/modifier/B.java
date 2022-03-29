package com.sean.modifier;

public class B {
    public  void say(){
        A a = new A();
        //同包可以访问public，protected，default
        System.out.println(a.n1+a.n2 + a.n3);

        a.m1();a.m2();a.m3();//a.m4();
    }
}
