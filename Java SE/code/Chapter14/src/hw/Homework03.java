package hw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
实例化一个Map类型对象m，键值对存储姓名工资
将jack工资改为2600
所有员工加薪100
遍历所有员工
遍历所有工资
 */
public class Homework03 {
    public static void main(String[] args) {
        HashMap m = new HashMap();
        m.put("tom",2600);
        m.put("jack",1000);
        m.put("mary",1500);
        m.put("jack",2600);

        Set keySet = m.keySet();
        for (Object key :keySet) {
            m.put(key, (Integer)m.get(key)+100);
        }
        Set set = m.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry  = (Map.Entry) iterator.next();
            System.out.println(entry.getKey());
        }
        iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry  = (Map.Entry) iterator.next();
            System.out.println(entry.getValue());
        }
    }
}
