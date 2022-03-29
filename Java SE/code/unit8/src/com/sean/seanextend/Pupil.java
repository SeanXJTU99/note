package com.sean.seanextend;

public class Pupil{
    public String name;
    public  int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void testing(){
        System.out.println(name + "is testing math");
    }
    public void showInfo(){
        System.out.println("name = " +name+ "\nage="+ age+ "\nscore"+score);
    }
}
