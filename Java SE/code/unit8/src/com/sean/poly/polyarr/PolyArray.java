package com.sean.poly.polyarr;

public class PolyArray {
    public static void main(String[] args) {
        //创建1Person，2student，2teacher，统一放在多态数组中
        //并调用每个对象的say方法
        Person[] persons = new Person[5];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("tommy", 20, 100);
        persons[2] = new Student("smith", 18, 60);
        persons[3] = new Teacher("mary", 48, 6000);
        persons[4] = new Teacher("white", 50, 10000);
        //循环遍历数组，调用say
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());//动态绑定
            //类型判断 + 向下转型
            if (persons[i] instanceof Student) {
                Student student = (Student) persons[i];
                student.study();
            } else if (persons[i] instanceof Teacher) {
                ((Teacher) persons[i]).teach();
            }
        }
    }
}
