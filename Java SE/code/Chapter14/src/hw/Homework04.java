package hw;

import java.util.HashSet;
import java.util.Objects;

public class Homework04 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        Person p1 =new  Person(1,"a");
        Person p2 =new  Person(2,"b");
        hashSet.add(p1);
        hashSet.add(p2);
        p1.name = "c";
        hashSet.remove(p1);//p1.name被修改，remove按照修改后hash查找索引，无法找到，无法删除
        System.out.println(hashSet);
        hashSet.add(new  Person(1,"c"));//添加了新索引元素
        System.out.println(hashSet);
        hashSet.add(new  Person(1,"a"));//索引与p1相同，但equals不同，加入链表
        System.out.println(hashSet);

    }
}
class Person{
    public int id;
    public String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "{" +
                id +
                ", " + name + '\'' +
                '}';
    }
}