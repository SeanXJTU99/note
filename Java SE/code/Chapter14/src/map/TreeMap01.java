package map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap01 {
    public static void main(String[] args) {
//        TreeMap treeMap = new TreeMap();
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        treeMap.put("tom",1);
        treeMap.put("jack",2);
        System.out.println(treeMap);

    }
}
