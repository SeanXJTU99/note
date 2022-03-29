package com.sean.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
//        person.name = "jack";
        person.setName("jackkey");
        person.setAge(300);
        person.setSal(100.0);
        System.out.println(person.info());
        Person smith = new Person("smith", 200, 5000);
        System.out.println("========");
        System.out.println(smith.info());
    }
}
class Person{
    public String name;
    private int age;
    private double sal;
    //构造器alt+insert
    public Person(){}

    public Person(String name, int age, double sal) {
//        this.name = name;
//        this.age = age;
//        this.sal = sal;
        //将set写在构造器中
        setSal(sal);
        setName(name);
        setAge(age);
    }

    //返回属性值
    public String info(){
        return "name= "+ name +"age="+ age+"salary" + sal;
    }

    //setter getter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        //加入数据检验
        if(name.length() >= 2 && name.length()<=6) {
            this.name = name;
        }else{
            System.out.println("length of name should between 2 and 6");
            this.name = "default";
        }
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        //增加判断
        if(age >= 1 && age <= 120) {
            this.age = age;
        }else{
            System.out.println("age should between 1 - 120，默认年龄18");
            this.age = 18;//默认
        }
    }
    public double getSal() {
        return sal;
    }
    public void setSal(double sal) {
        //可以增加当前对象的权限判断
        this.sal = sal;
    }
}
