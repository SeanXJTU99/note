package com.sean.seanextend;

public class Graduate {
    public String name;
    public  int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }
    public void showInfo(){
        System.out.println("name = " +name+ "\nage="+ age+ "\nscore"+score);
    }
    public void testing(){
        System.out.println(name + "is testing math");
    }
}
