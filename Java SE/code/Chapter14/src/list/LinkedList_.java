package list;

import java.util.Iterator;
import java.util.LinkedList;
@SuppressWarnings("all")
public class LinkedList_ {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.remove();
        linkedList.set(0,999);
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        linkedList.size();
    }
}
