package com.sean.seanextend;

public class Extends {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "xiaoming";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();

        Graduate graduate = new Graduate();
        graduate.name = "jinjao";
        graduate.age = 20;
        graduate.testing();
        graduate.setScore(100);
        graduate.showInfo();

    }
}
