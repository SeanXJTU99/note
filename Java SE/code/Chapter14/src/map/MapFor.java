package map;

import java.util.*;

@SuppressWarnings("all")
public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1,"11");
        map.put(2,"12");
        map.put(3,"13");
        map.put(4,"14");
        //1.先取出key，再通过key访问value
        Set keyset = map.keySet();
        //  1)for
        for (Object key : keyset) {
            System.out.println(key + "-" + map.get(key));
        }
        //  2)iterator
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        //2.只取所有的values
        Collection values = map.values();
        for (Object value :values) {
            System.out.println(values);
        }
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object value = iterator1.next();
            System.out.println(value);
        }
        //3.用entrySet获取所有k-v
        Set entrySet = map.entrySet();
        for (Object o :entrySet) { //entrySet存放的是entry对象
            //将entry转为Map.Entry
            Map.Entry m = (Map.Entry)o;
            System.out.println(m.getKey()+"-"+m.getValue());
        }
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object entrynext = iterator2.next();
//            System.out.println(entrynext);
            Map.Entry m =(Map.Entry) entrynext;
            System.out.println(m.getKey()+ "-" +m.getValue());
        }
    }
}
