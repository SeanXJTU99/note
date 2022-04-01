package abstract_;

public class AA {
    public void job(){
        long start = System.currentTimeMillis();
        long res = 0;
        for (int i = 1; i <= 1000000; i++) {
            res += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("AA time = " + (end-start));
    }
}
class BB{
    public void job(){
        long start = System.currentTimeMillis();
        long res = 0;
        for (int i = 1; i <= 800000; i++) {
            res += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("BB time = " + (end-start));
    }
}
