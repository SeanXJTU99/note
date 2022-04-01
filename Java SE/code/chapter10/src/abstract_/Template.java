package abstract_;

abstract public class Template {
    public  abstract void job();
    public void Timer(){
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("time = " + (end-start));
    }
}
class A extends Template{
    public  void job(){
        long res = 0;
        for (int i = 1; i <= 1000000; i++) {
            res += i;
        }
    }
}
class B extends Template{
    public  void job(){
        long res = 0;
        for (int i = 1; i <= 800000; i++) {
            res += i;
        }
    }
}