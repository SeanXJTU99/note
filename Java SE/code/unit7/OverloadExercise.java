public class OverloadExercise {
    public static void main(String []args) {
		Methods myMethods = new Methods();
		int a = myMethods.m(1,1);
		int b = myMethods.m(2);
		System.out.println(a+b);
		myMethods.m("hello world");
		double c = myMethods.max(1.0,2.0,3.0);
		System.out.println(c);
    }
}
class Methods{
	public int m(int n1, int n2){
		return n1*n2;
	}
	public int m(int n){
		return n*n;
	}
	public void m(String a){
		System.out.println(a);
	}
	public int max(int n1, int n2){
		return n1>n2 ? n1:n2;
	}
	public double max(double a, double b){
		return a>b ? a: b;
	}
	public double max(double a, double b, double c){
		//return max(a,b)>max(b,c)? max(a,b):max(b,c);
		return max(a,max(b,c));
	}
}