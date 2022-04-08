package generic;

import java.util.*;

public class GenericExercise {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("jack",10));
        students.add(new Student("tom",12));
        students.add(new Student("luv",40));
        for (Student student :students) {
            System.out.println(student);
        }

        HashMap<String, Student> hashMap = new HashMap<>();
        hashMap.put("jack",new Student("jack",10));
        hashMap.put("tom",new Student("tom",12));
        hashMap.put("may",new Student("may",15));
        Set<Map.Entry<String, Student>> entries = hashMap.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> entry = iterator.next();
            System.out.println(entry.getKey()+entry.getValue());
        }

    }
}
class Student{
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

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}