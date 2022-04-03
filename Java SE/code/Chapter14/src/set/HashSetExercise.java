package set;

import java.util.HashSet;
import java.util.Objects;
@SuppressWarnings("all")
public class HashSetExercise {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Person("tom",10,1000) );
        hashSet.add(new Person("jack",20,1000) );
        hashSet.add(new Person("jack",30,1000) );
        hashSet.add(new Person("tom",10,2000) );

        System.out.println(hashSet);
    }
}
class Person {
    private final String name;
    private final int age;
    private final double sal;

    public Person(String name, int age, double sal) {
        this.name = name;
        this.age = age;
        this.sal = sal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && sal == person.sal &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age + '\''+
                ", salary=" + sal +
                '}';
    }
}