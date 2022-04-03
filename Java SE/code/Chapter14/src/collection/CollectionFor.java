package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionFor {
    public static void main(String[] args) {
        ArrayList col = new ArrayList();
        col.add(new Book("jack",10));
        col.add(new Book("jak",20));
        col.add(new Book("jk",30));
//
//        for(Object obj : col){
//            System.out.println(obj);
//        }
//
//        int[] nums = {1,2,3,4,5};
//        for(int i:nums){
//            System.out.println(i);
//        }
        List list = new ArrayList();
        list.add(new Dog(10));
        list.add(new Dog(20));
        list.add(new Dog(30));
        list.add("dog");
        for (Object dog :list) {
            System.out.println(dog);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object dog = it.next();
            System.out.println(dog);
        }
    }
}
class Dog{
    public Dog(int age) {
        this.age = age;
    }

    private int age;

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                '}';
    }
}
