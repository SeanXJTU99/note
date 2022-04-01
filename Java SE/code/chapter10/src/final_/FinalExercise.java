package final_;

public class FinalExercise {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        double area = circle.Area();
        System.out.println(area);
    }
}
class Circle{
    private double radius;
    private final double PI = 3.14;
    private final double pi;
    private final double Pi;
    public Circle(double radius){
        this.radius = radius;
        pi = 3;
    }
    {
        Pi = 3.1415926;
    }
    public double Area(){
        return PI * radius * radius;
    }
}