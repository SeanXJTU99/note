package list;

import java.util.ArrayList;
import java.util.List;

public class List_ {
    public static void main(String[] args) {
        List list = new ArrayList ();
        list.add("jack");
        list.add("tom");
        list.add(10);
        System.out.println(list.get(2));
    }
}
