package com.sean.poly.objpoly;

public class PolyObject {
    public static void main(String[] args) {
        //对象多态，编译类型和运行类型
        //编译animal，运行dog
        Animal animal = new Dog();
        animal.cry();   //执行到这里时 animal运行类型是dog，所以是dog的cry（）

        animal = new Cat();
        animal.cry();   //运行类型为Cat
        animal = new Fish();
        animal.cry();
    }

}
