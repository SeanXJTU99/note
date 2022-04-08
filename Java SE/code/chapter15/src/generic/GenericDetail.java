package generic;

public class GenericDetail {
    public static void main(String[] args) {
        Pig<A> aPig = new Pig<>(new B());
    }
}
class A{}
class B extends A{}
class Pig<E>{
    E e;

    public Pig(E e) {
        this.e = e;
    }
}