package map;

import java.util.HashMap;

public class HashMapSource {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(1,"1");
        map.put(2,"2");
        map.put(1,"3");
        System.out.println(map);
    }
}
