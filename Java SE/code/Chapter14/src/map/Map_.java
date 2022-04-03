package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("all")
public class Map_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1","jack");
        map.put("no2","tom");
        map.put("no2","mary");//key相同相当于替换
        map.put(1,2);
        /*
        entrySet中定义的类型是Map.Entry 但实际存放依然是Node，因为Node是Entry的实现子类
        当把Node对象存放到entrySet中就方便了遍历，因为Entry提供了getKey和gtValue方法
         */
        Set set  = map.entrySet();
        System.out.println(set.getClass());
        for (Object obj : set) {
            //向下转型
            Map.Entry entry = (Map.Entry)obj;
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        /*
        可以单独获得key值或value值
        通过keySEt和valueSet方法
        返回keySet valueSet对象
        都是Map的内部类，分别实现了Set和Collection接口
         */
        Set set1 = map.keySet();
        Collection values = map.values();

    }
}
