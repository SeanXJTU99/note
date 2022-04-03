package list;

import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("all")
public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList ();
        list.add("jack");
        list.add("tom");
        list.add(10);
        list.add(1,"mary");
        System.out.println(list);
        Object obj = list.remove(2);
        System.out.println(obj);
        list.set(2,"tom");
        System.out.println(list);
        for (Object ele :list) {
            System.out.println(ele);
        }
    }
}
