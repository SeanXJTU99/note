package generic;

import java.util.ArrayList;
import java.util.Comparator;

public class GenericExercise02 {
    public static void main(String[] args) {
        ArrayList<Emp> emps = new ArrayList<>();
        emps.add(new Emp("jack", 4000,
                new MyDate(1999, 5, 4)));
        emps.add(new Emp("tom", 5000,
                new MyDate(1998, 5, 31)));
        emps.add(new Emp("mary", 4000,
                new MyDate(2000, 6, 1)));
        System.out.println(emps);
        emps.sort(new Comparator<Emp>() {
            @Override
            public int compare(Emp emp1, Emp emp2) {
                if (!(emp1 instanceof Emp && emp2 instanceof Emp)) {
                    System.out.println("class cast error");
                    return 0;
                }
                //先比较name
                int i = emp1.getName().compareTo(emp2.getName());
                if (i != 0) {
                    return i;
                }
                return emp1.getBirth().compareTo(emp2.getBirth());
            }
        });
        System.out.println(emps);
    }
}

class Emp {
    private String name;
    private double sal;
    private MyDate birth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirth() {
        return birth;
    }

    public void setBirth(MyDate birth) {
        this.birth = birth;
    }

    public Emp(String name, double sal, MyDate birth) {
        this.name = name;
        this.sal = sal;
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birth=" + birth +
                '}';
    }
}