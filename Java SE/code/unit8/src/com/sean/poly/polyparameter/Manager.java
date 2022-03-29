package com.sean.poly.polyparameter;

public class Manager extends Employee{
    private double bonus;

    public void Manage(){
        System.out.println("manager " + getName() + " is managing");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, double sal, double bonus) {
        super(name, sal);
        this.bonus = bonus;
    }
}
