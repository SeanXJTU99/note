package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExercise {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put(1, new Emp("tom", 3000, 1));
        hashMap.put(2, new Emp("jack", 420000, 2));
        hashMap.put(3, new Emp("sean", 14000, 3));
        Set keySet = hashMap.keySet();
        for (Object key : keySet) {
            //获取value
            Emp emp = (Emp) hashMap.get(key);
            if (emp.getSal() > 18000) {
                System.out.println(emp);
            }
        }
        Set entrySet = hashMap.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry next = (Map.Entry) iterator.next();
            //通过Entry得到
            Emp emp = (Emp) next.getValue();
            if(emp.getSal() > 18000){
                System.out.println(emp);
            }
        }

    }
}

class Emp {
    private String name;
    private double sal;
    private int id;

    public Emp(String name, double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
