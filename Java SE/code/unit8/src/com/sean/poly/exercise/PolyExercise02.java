package com.sean.poly.exercise;

public class PolyExercise02 {
    public static void main(String[] args) {
        Sub sub = new Sub();
        System.out.println(sub.count);
        sub.display();
        Base b = sub;
//        String s1 = "Hello";
//        String s2 = "hello";
//        System.out.println(s1 == s2);
        System.out.println(b == sub);//指向同一个对象
        System.out.println(b.count);//访问属性，编译类型
        b.display();//方法调用，运行类型
    }
}

class Base {
    int count = 10;

    public void display() {
        System.out.println(this.count);
    }
}

class Sub extends Base {
    int count = 20;

    public void display() {
        System.out.println(this.count);
    }
}
