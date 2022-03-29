package com.sean.override;

import sun.dc.path.PathError;

public class OverrideExercise {
    public static void main(String[] args) {
        Person jack = new Person("jack", 10);
        System.out.println(jack.say());
        Student smith = new Student("smith", 10, 123456, 100);
        System.out.println(smith.say());
    }
}
