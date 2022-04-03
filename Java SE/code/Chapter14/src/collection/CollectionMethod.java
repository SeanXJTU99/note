package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionMethod {
    public static void main(String[] args) {
//        list list = new ArrayList();
//        list.add("jack");
//        list.add(10);
//        System.out.println(list);
//
//        list.remove(0);
//        list.remove("jack");
//        System.out.println(list);
//        ArrayList list2 = new ArrayList();
//        list2.add("10");
//        list2.add("jack");
//        list.addAll(list2);
//        System.out.println(list);
//
//        Iterator iterator = list.iterator();
//        do {
//            System.out.println(iterator.next());
//        }while(iterator.hasNext());

        ArrayList col = new ArrayList();
        col.add(new Book("jack",10));
        col.add(new Book("jak",20));
        col.add(new Book("jk",30));

        Iterator iterator1 = col.iterator();

        while (iterator1.hasNext()) {
            Object obj =  iterator1.next();
            System.out.println(obj);
        }
        iterator1 = col.iterator();
    }
}
