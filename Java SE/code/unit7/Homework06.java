public class Homework06 {
    public static void main(String []args) {
		double n1 = 1.0;
		double n2 = 0.0;
		Cale cale = new Cale(n1, n2);
		double res = cale.div();
		System.out.println(res);
    }
}
class Cale{
	public double n1;
	public double n2;
	public Cale(double n1, double n2){
		this.n1 = n1;
		this.n2 = n2;
	}
	public double div(){
		if(n2!=0){
		double res = n1/n2;
		return res;}
		else{System.out.println("n2 is zero.");return 0;}
	}
}