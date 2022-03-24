public class ForExercise{
	public static void main(String []args) {
		//1-100
		//filter i%9=0
		//sum\count
		int count =0;
		int sum =0;
		int star =1;
		int end =100;
		int filter = 9;
		for (int i =star;i<=end;i++){
		if( i%filter == 0){
			System.out.println("i="+i);count ++ ;sum += i;
			}
		}System.out.println(count);System.out.println(sum);
	}
}