package com.sean.poly;

public class PolyDetail03 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);//true
        System.out.println(bb instanceof AA);//true
        AA aa = new BB();
        System.out.println(aa instanceof BB);//true
        System.out.println(aa instanceof AA);//true
        AA Aa = new AA();
        System.out.println(Aa instanceof BB);//false
        System.out.println(aa instanceof AA);//true
    }
}
class AA{}//父类
class BB extends AA{}//子类