public class Homework05 {
    public static void main(String []args) {
		double r = 1.5;
		Circle cir = new Circle(r);
		System.out.println(cir.circle());
    }
}
class Circle{
	public double r;
	public Circle(double radius){
		r = radius;
	}
	public double circle(){
		double c = 2 * Math.PI * r;
		return c;
	}
	public double area(){
		double a = Math.PI * r * r;
		return a;
	}
}