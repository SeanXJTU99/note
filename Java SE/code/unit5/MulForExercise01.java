import java.util.Scanner;
public class MulForExercise01{
	public static void main(String []args) {
		Scanner myScanner = new Scanner(System.in);
		double total = 0;
		int passNum =0;
		for (int i =1; i <=3; i ++){
		double sum =0;
		for (int j=1; j<=5; j++){
			System.out.println("plz input class"+i+" No." + j + " student's score:");
			double score = myScanner.nextDouble();
			System.out.println("score is " + score);
			if(score>=60){passNum ++;}
			sum += score;
		}
		System.out.println("ave score is " + sum/5); total += sum;
		}System.out.println("total ave score is " +total/15);
		System.out.println("pass number is " +passNum);
	}
}