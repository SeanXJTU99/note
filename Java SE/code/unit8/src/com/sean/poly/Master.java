package com.sean.poly;

public class Master {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Master(String name) {
        this.name = name;
    }

    //使用多态机制，统一管理喂食
    //animal 可以指向Animal子类的对象
    //food 也可以指向Food子类的对象
    public void feed(Animal animal, Food food){
        System.out.println("master " + name + " feed " + animal.getName()
                +" with " + food.getName());
    }
}
//    //给小猫 喂食 骨头
//    public  void feed(Cat cat, Bone bone){
//        System.out.println("master " + name + " feed " + cat.getName()
//                +" with " + bone.getName());
//    }
//    //给小猫 喂食 鱼 方法重载
//    public  void feed(Cat cat, Fish fish){
//        System.out.println("master " + name + " feed " + cat.getName()
//                +" with " + fish.getName());
//    }


