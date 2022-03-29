package com.sean.Object;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person1 = new Person("jack", 12, 'M');
        Person person2 = new Person("jack", 12, 'M');

        System.out.println(person1.equals(person2));//未重写，返回false
    }
}
class Person{
    private String name;
    private int age;
    private char gender;
    //重写equals

    public boolean equals(Object obj){
        //若为同一个对象则true
        if(this == obj){
            return true;
        }
        if(obj instanceof Person){
            //先向下转型以访问obj的Person属性
            Person p =(Person)obj;
            return this.name.equals(p.name) && this.age==p.age && this.gender == p.gender;
        }
        //若传入对象类型不是Person，false
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}