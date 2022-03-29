package com.sean.override;

public class Dog extends Animal{
    //dog是animal子类
    //dog的cry方法和animal的cry定义形式一样
    //dog的cry方法重写了animal的cry
    public void cry(){
        System.out.println("the dog is crying");
    }
    public String m1(){
        return null;
    }
    public BBB m2(){return null;}
}
