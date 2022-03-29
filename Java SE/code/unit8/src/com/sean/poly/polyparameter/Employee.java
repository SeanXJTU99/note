package com.sean.poly.polyparameter;

public class Employee {
    private String name;
    private double sal;
    public double getAnnual(){
        return 12 * sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public Employee(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }
}
