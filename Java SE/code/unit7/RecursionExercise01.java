/*public class RecursionExercise01 {
    public static void main(String []args) {
		T t1 = new T();
		int n = t1.fab(4);
		System.out.println(n);
	}
}
class T{
	public int fab(int n){
		if(n<=2){
			return 1;
		}else{
			return fab(n-1)+fab(n-2);
		}
}}*/
public class RecursionExercise01 {
    public static void main(String []args) {
		T t1 = new T();
		int day = 1;
		int peachNum = t1.peach(day);
		System.out.println(peachNum);
	}
}
class T{
	public int peach(int day){
		if(day == 10){
			return 1;
		}else if (day >=1 && day <= 9){
			return (peach(day+1)+1)*2;
		}else{System.out.println("get out");
			 return -1;}
	}
}