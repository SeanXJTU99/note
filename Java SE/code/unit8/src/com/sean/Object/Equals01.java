package com.sean.Object;

public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == b);
        System.out.println(a == c);
        B bObj = a;
        System.out.println(bObj == a);
        "hello".equals("abc");
        Integer n1 = new Integer(100);
        Integer n2 = new Integer(100);
        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));
    }
}

class A extends B {
}
class B{}