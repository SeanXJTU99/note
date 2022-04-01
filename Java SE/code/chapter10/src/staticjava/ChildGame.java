package staticjava;

public class ChildGame {
    public static void main(String[] args) {
//        int count = 0;
        Child child1 = new Child("jot");
        child1.join();
        child1.count++;
        Child child2 = new Child("tom");
        child2.join();
        child2.count++;
        Child child3 = new Child("mary");
        child3.count++;
    }
}
class Child{
    private String name;
    public static int count =0;//被Child类的所有对象共享

    public Child(String name) {
        this.name = name;
    }
    public void join(){
        System.out.println(name +"joined" + count);
    }
}
