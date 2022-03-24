import java.util.Scanner;
public class SwitchExercise{
    public static void main(String []args) {
	Scanner myScanner = new Scanner(System.in);
	/*System.out.println("char from a to z:");
	char c1 = myScanner.next().charAt(0);
	switch(c1){
		case 'a':
			System.out.println("A");
			break;
		case 'b':
			System.out.println("B");
			break;
		case 'c':
			System.out.println("C");
			break;
		default:
			System.out.println("other");
	}System.out.println("get out");*/
	/*System.out.println("your grade:");
	// [60,100] (int)(grade/60) =1
	// [0,60) (int)(grade/60) =0
	int score = myScanner.nextInt();
	if(score >=0 && score<=100){
		switch((int)(score / 60)){
		case 0:
			System.out.println(" not pass");
			break;
		case 1:
			System.out.println("pass");
			break;
		}
	}else{
		System.out.println("grade should in range 100");
	}*/
	//345spring 678summer ...
	System.out.println("input month:");
	int month = myScanner.nextInt();
	switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("summer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("autumn");
			break;
		case 1:
		case 2:
		case 12:
			System.out.println("winter");
			break;
		default:
			System.out.println("false");
	}
}}