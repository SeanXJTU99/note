package set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {
//        TreeSet treeSet = new TreeSet();
//        treeSet.add("jack");
//        treeSet.add("tom");
//        treeSet.add("sp");
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).compareTo((String)o2);
            }
        });
        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("sp");
        System.out.println(treeSet);
    }
}
