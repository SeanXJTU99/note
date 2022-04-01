package exceptions;

public class NullPointerException_ {
    public static void main(String[] args) {
//        String name = null;
//        System.out.println(name.length());
        int[] arr = {1,2,4};
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
