import java.util.Scanner;
public class Array02{
	public static void main(String []args) {
		double[] scores = new double[5];
		Scanner myScanner = new Scanner(System.in);
		for (int i=0; i<5; i++){
			System.out.println("plz input score:");
			scores[i] = myScanner.nextDouble();
		}
		System.out.println("elements of the Array scores are");
		for (int i = 0; i < 5; i ++){
			System.out.print( scores[i]+ " ");
		}
	}
}