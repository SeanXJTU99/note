package collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections_ {
    public static void main(String[] args) {
        //创建集合测试
        List list = new ArrayList   ();
        list.add("tom");
        list.add("jack");
        list.add("smith");

        Collections.reverse(list); //反转
        System.out.println(list);

        Collections.shuffle(list); //随机打乱
        System.out.println(list);
        Collections.sort(list); //自然排序
        System.out.println(list);
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() -((String)o2).length() ;
            }
        });
        Collections.swap(list, 0, 1); //两元素交换

        System.out.println(Collections.max(list));  //自然排序最大
        System.out.println(Collections.max(list, new Comparator() {//指定排序最大
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() -((String)o2).length();
            }
        }));

        Collections.frequency(list,"tom");


        //拷贝
        ArrayList dest = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            dest.add("");
        }
        Collections.copy(dest, list);
        System.out.println(dest);

        Collections.replaceAll(list, "tom", "jack");
    }
}
