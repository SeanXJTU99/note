package customgeneric;

public class CustomGeneric {
    public static void main(String[] args) {
        Tiger<Double,Integer,String> g = new Tiger<>("jack");
        g.setT(10.9);
        System.out.println(g);
        Tiger g2 = new Tiger("john");//此时泛型全为Object
        g2.setT("yy");
        System.out.println(g2);
    }
}
class Tiger<T,R,M>{
    String name;
    R r;
    M m;
    T t;
//    T[] ts = new T[8];
//    public static void m1(M m){}
    public Tiger(String name){
        this.name = name;
    }
    public Tiger( R r, M m, T t) {

        this.r = r;
        this.m = m;
        this.t = t;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}