package innerclass;

public class AnonymousInnerClassExercise01 {
    public static void main(String[] args) {
        f1(new IL(){
            @Override
            public void show() {
                System.out.println("this is IL");
            }
        });
        //传统方法：
        Car car = new Car();
        f1(car);
    }
    public static void f1(IL il){
        il.show();
    }
}
interface IL{
    void show();
}
class Car implements IL{
    @Override
    public void show() {
        System.out.println("this is IL from Car");
    }
}
