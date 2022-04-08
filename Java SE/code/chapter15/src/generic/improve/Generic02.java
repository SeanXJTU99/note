package generic.improve;

import java.util.ArrayList;
import java.util.List;

public class Generic02 {
    public static void main(String[] args) {
        List<Integer> lsit = new ArrayList<>();
        ArrayList<Dog> arrayList = new ArrayList<>();
        arrayList.add(new Dog("do1",1));
        arrayList.add(new Dog("do2",2));
        arrayList.add(new Dog("do3",3));
        //如果加入一只猫，
//        arrayList.add("123");
//        for (Object o :arrayList) {
//            Dog dog = (Dog)o;
//            System.out.println(dog);
//        }
        for (Dog dog :arrayList) {
            System.out.println(dog.getAge());
        }
    }
}
class Dog{
    private String name;
    private int age;

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

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
