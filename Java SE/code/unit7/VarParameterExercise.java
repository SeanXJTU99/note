public class VarParameterExercise {
    public static void main(String []args) {
		double[] scores = {10,20,30};
		Vmethod m = new Vmethod();
		m.f("Bai", scores);
		System.out.println(m.f2("Bai", 10.0,20.0,30.0,40.0));
    }
}
class Vmethod{
	public void f(String name, double... scores){
		System.out.println(name);
		double res = 0;
		for(int i = 0; i< scores.length; i++){
			res += scores[i];}
		System.out.print(res);
	}
	public String f2(String name, double... scores){
		double res = 0;
		for(int i = 0; i< scores.length; i++){
			res += scores[i];}
		return name + " "+ res;
}
}