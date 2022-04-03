package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMethod {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("jack");
        set.add("john");
        set.add("lucy");
        set.add("jack");
        set.add(null);
        System.out.println(set);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.print(next + " ");
        }
        System.out.println();
        set.remove(null);
        for (Object o : set) {
            System.out.print(o + "　");
        }

    }
}
