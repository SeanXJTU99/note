package set;

import java.util.HashSet;

@SuppressWarnings("all")
public class HashSetSource {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("jack");
        hashSet.add("tom");
        hashSet.add("jack");
        System.out.println(hashSet);
//        for (int i = 0; i < 100; i++) {
//            hashSet.add(i);
//        }
        for (int i = 0; i < 12; i++) {
            hashSet.add(new A(i));

        }
        System.out.println(hashSet);
    }
}
class A{
    private  int i;
    public A(int n){
        this. i = n;
    }

    @Override
    public int hashCode() {
        return 100;
    }
}