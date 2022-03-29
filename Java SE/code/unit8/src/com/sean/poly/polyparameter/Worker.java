package com.sean.poly.polyparameter;

public class Worker extends Employee{
    public Worker(String name, double sal) {
        super(name, sal);
    }

    public void work(){
        System.out.println("worker " + getName()+ " is working" );
    }

    @Override
    public double getAnnual() {//没有其他收入
        return super.getAnnual();
    }
}
