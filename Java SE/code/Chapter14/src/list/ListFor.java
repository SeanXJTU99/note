package list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
@SuppressWarnings("all")
public class ListFor {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("jack");
        list.add("tom");
        list.add(10);
        list.add(1,"mary");
        System.out.println(list);
        Object obj = list.remove(2);
        System.out.println(obj);
        list.set(2,"tom");
        System.out.println(list);

        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            System.out.println(next);
        }

        for (Object ele :list) {
            System.out.println(ele);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
