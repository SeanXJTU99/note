import java.util.Scanner;
public class BreakExercise{
	public static void main(String []args) {
		//1-100 sum, stop when sum>20
		/*int sum = 0;
		int i = 0;
		for (;i<=100;){
			sum += i;
			if(sum>20){
				//System.out.println("when sum=" + sum+" >20 i=" + i);
				break;
			}
			i++;
		}System.out.println("when sum=" + sum+" >20 i=" + i);*/
		//3 times for login, sean, 666->break
		//scanner String name, String passwd
		Scanner myScanner = new Scanner(System.in);
		String name = "";String pawd = "";
		//chances left
		int chance = 3;
		for (int i=1; i<=3;i++){
			System.out.println("input your login");
			name = myScanner.next();
			System.out.println("input your password");
			pawd = myScanner.next();
			//difference
			//string : equals
			if("sean".equals(name) && "666".equals(pawd)){
				System.out.println("log in");
				break;
			}
			chance --;
			System.out.println(chance + " times left.");
		}
	}
}