import java.util.Scanner;
public class DoWhileExercise02{
	public static void main(String []args) {
		Scanner myScanner = new Scanner(System.in);
		char ans = ' ';
		do{
			System.out.println("give back money?");
			ans = myScanner.next().charAt(0);
			System.out.println("his answer is "+ ans);
		}//while(true);
		while(ans!='y');System.out.println("his gave money back");
	}
}