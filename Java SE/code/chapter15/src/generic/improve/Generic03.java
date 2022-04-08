package generic.improve;

public class Generic03 {
    public static void main(String[] args) {
        Person<String> jack = new Person<>("jack");
        Person<Integer> integerPerson = new Person<>(5);
    }
}
class Person<T>{
    //该类型是在实例化Person时指定的

    //属性类型
    T s;
    //参数类型
    public Person(T s) {
        this.s = s;
    }
    //返回类型
    public T f(){
        return s;
    }
}