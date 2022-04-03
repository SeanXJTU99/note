package list;

import java.util.Vector;

@SuppressWarnings("all")
public class Vector_ {
    public static void main(String[] args) {

        //无参构造
        Vector vector = new Vector();
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        vector.add(100);
    }
}
