import java.util.Scanner;
public class Switch01{
    public static void main(String []args) {
	Scanner myScanner = new Scanner(System.in);
	System.out.println("char:");
	char c1 = myScanner.next().charAt(0);
	switch(c1){
		case 'a':
			System.out.println("Monday");
			break;
		case 'b':
			System.out.println("Tuesday");
			break;
		default:
			System.out.println("fuck you");
	}System.out.println("get out");
}}