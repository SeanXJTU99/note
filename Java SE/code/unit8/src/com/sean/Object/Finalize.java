package com.sean.Object;

public class Finalize {
    public static void main(String[] args) {
        Car porsh = new Car("porsh");
        porsh = null;
        System.gc();
        System.out.println("program quit");
    }
}
class Car{
    private final String name;
    //属性中可能包含一些资源，数据库链接等

    public Car(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize car "+name);
//        super.finalize();
    }
}