package com.sean.seanextend;

/*
继承的本质
 */
public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();//内存的变化
        System.out.println(son.name);//查找关系返回信息
        //首先看子类是否有name属性且可以访问
        //子类没有就向上查找父类
        System.out.println(son.age);
        System.out.println(son.hobby);
    }
}

class GrandPa {
    String name = "papa";
    String hobby = "pp";
}

class Father extends GrandPa {
    String name = "baba";
    int age = 39;
}

class Son extends Father {
    String name = "ss";
}
