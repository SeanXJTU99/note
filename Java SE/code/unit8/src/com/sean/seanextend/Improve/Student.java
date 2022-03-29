package com.sean.seanextend.Improve;
//时Pupil和Graduate的父类
public class Student {
    //共有属性
    public String name;
    public  int age;
    private double score;
    //共有方法
    public void setScore(double score) {
        this.score = score;
    }
    public void showInfo(){
        System.out.println("name = " +name+ "\nage="+ age+ "\nscore"+score);
    }
    //testing 不一样，去除
//    public void testing(){
//        System.out.println(name + "is testing math");
//    }
}
