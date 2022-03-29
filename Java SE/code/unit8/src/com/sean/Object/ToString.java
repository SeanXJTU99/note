package com.sean.Object;

public class ToString {
    public static void main(String[] args) {
        Monster xyg = new Monster("xyg", 10000);
        System.out.println(xyg.toString() + xyg.hashCode());
        System.out.println(xyg);
    }
}
class Monster{
    public Monster(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    private String name;
    private double sal;
    public String toString(){
        return "Monster{ "+"name = '" +name +'\t'+", salary = '" + sal+"' }";
    }
}