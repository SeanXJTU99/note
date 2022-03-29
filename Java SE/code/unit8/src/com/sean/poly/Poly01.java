package com.sean.poly;

public class Poly01 {
    public static void main(String[] args) {

        Master tom = new Master("tom");
        Cat ca = new Cat("ca");
        Bone bo = new Bone("bo");
        tom.feed(ca,bo);
        Cat mic = new Cat("mic");
        Fish fi = new Fish("fi");
        tom.feed(mic,fi);
        Pig pp = new Pig("pp");
        Rice rice = new Rice("rice");
        tom.feed(pp,rice);

    }
}
