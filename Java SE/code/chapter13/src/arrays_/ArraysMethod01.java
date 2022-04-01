package arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysMethod01 {
    public static void main(String[] args) {
        Integer[] integers = {1,20,90};
//        System.out.println(Arrays.toString(integers));
        Integer arr[] = {1,-1,7,0,9};
        //sort排序会直接影响到实参arr
        //通过传入接口Comparator实现定制排序
        //两个参数，1.排序数组arr，2.comparator的匿名内部类，实现compare方法
        Arrays.sort(arr, new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer)o1;
                Integer i2 = (Integer)o2;
                return i2 - i1;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
