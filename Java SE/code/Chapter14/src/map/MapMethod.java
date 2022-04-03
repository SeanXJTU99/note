package map;

import java.util.HashMap;
import java.util.Map;

public class MapMethod {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("n1", 100);
        Object val = map.get("n1");
        System.out.println(val);
         }
}
