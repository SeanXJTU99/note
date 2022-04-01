package annotation;

import java.util.ArrayList;
import java.util.List;
//@SuppressWarnings({"all"})
public class SuppressWarning_ {
//    @SuppressWarnings({"rawtypes","unchecked","unused"})
    public static void main(String[] args) {
        @SuppressWarnings({"rawtypes"})
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        @SuppressWarnings({"unused"})
        int i;
        System.out.println(list.get(1));
    }
}
//当我们不想看到警告，可以用SuppressWarning抑制

