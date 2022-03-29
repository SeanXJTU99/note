public class MethodExercise01 {
    public static void main(String []args) {
		AA a = new AA();
		boolean b= a.isOdd(1);
		System.out.println(b);
		if(a.isOdd(2)){System.out.println("Odd");}else{System.out.println("Even");}
		a.print(4, 4, ',');
    }
}
class AA{	public boolean isOdd(int n){
		//if(n%2 != 0){return true;}else{return false;}
		//return n % 2 !=0 ? true:false;
		return n%2 !=0;	}
	public void print(int row, int column, char c){
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){System.out.print(c);}System.out.println();
		}	}}