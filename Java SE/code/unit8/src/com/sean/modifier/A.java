package com.sean.modifier;

public class A {
    //四个属性
    public int n1 =100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;
    //访问权限示例
    public void m1(){
        //同一类都可以访问
        System.out.println(n1 + n2 + n3+n4);
    }
    protected  void m2(){}
    void m3(){}
    private void m4(){}
    public void hi() {//同一个类中的方法都可以访问
        m1();
        m2();
        m3();
        m4();
    }
}
