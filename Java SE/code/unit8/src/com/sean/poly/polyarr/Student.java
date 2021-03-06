package com.sean.poly.polyarr;

public class Student extends Person {
    private double score;

    @Override
    public String say() {
        return super.say() + " score=" + score;
    }
    public void study(){
        System.out.println("student " + getName() + " is studying");
    }

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
