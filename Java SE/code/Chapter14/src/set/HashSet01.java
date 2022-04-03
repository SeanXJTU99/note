package set;

import java.util.HashSet;
@SuppressWarnings("all")
public class HashSet01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        System.out.println(set.add("jack"));
        System.out.println(set.add("tom"));
        System.out.println(set.add("ma"));
        System.out.println(set.add("lucy"));
        System.out.println(set.add("jack"));
//        System.out.println(set.remove("tom"));
        System.out.println(set.add(new Dog("tom")));
        System.out.println(set.add(new Dog("tom")));
        System.out.println(set.add(new String("tom")));
        System.out.println(set.add(new String("tom")));

        System.out.println(set);
    }
}
class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'';

    }
}
