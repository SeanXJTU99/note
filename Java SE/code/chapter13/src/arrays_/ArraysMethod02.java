package arrays_;

import java.util.Arrays;
import java.util.List;

public class ArraysMethod02 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,90,100,123};
        int index = Arrays.binarySearch(arr,100);
        System.out.println(index);
        Integer[] newarr = Arrays.copyOf(arr, arr.length-1);
        System.out.println(Arrays.toString(newarr));
        List asList = Arrays.asList(2,3,4,5,6,1);
        System.out.println(asList);
        System.out.println(asList.getClass());
    }
}
