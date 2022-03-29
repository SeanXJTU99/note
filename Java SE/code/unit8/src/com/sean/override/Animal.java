package com.sean.override;

public class Animal {
    public void cry(){
        System.out.println("crying");
    }
    public Object m1(){
        return null;
    }
    public AAA m2(){return null;}

}
class AAA{}
class BBB extends AAA{}
