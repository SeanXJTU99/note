import java.util.Scanner;
public class Homework04{
	public static void main(String []args) {
		//determine if a number is a 153 = 1^3+5^3+3^3?
		Scanner myScanner = new Scanner(System.in);
		System.out.println("plz input a integer:");
		int n = myScanner.nextInt();
		int n1 = (int)(n/100);
		int n2 = (int)((n%100)/10);
		//int n3 = n-100*n1-10*n2;
		int n3 = n%10;
		if( n1*n1*n1+n2*n2*n2+n3*n3*n3 == n){
			System.out.println("y");
		}else{
			System.out.println("n");
		}
	}
}