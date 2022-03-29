public class Homework13 {
    public static void main(String []args) {
		Circle c = new Circle();
		c.radius = 1;
		PassObject po = new PassObject();
		int times = 5;
		po.printAreas(c, times);
    }
}
class Circle{
	public double radius;
	public double findArea(){
		return Math.PI * radius *radius;	}}
class PassObject{
	public void printAreas(Circle c, int times){
		for(int i = 1; i <= times; i++){
			c.radius = i;
			System.out.println(i+"   "+c.findArea());
		}
	}
}