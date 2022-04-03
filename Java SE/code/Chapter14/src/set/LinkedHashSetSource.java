package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetSource {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add(new String("a"));
        set.add(456);
        set.add(456);

    }
}
