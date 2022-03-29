package com.sean.poly.polyarr;

public class Teacher extends Person{
    private double sal;

    @Override
    public String say() {
        return super.say() + " salary=" + sal;
    }

    public void teach(){
        System.out.println("teacher " + getName() + " is teaching class");
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public Teacher(String name, int age, double sal) {
        super(name, age);
        this.sal = sal;
    }
}
