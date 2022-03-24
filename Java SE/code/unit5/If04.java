import java.util.Scanner;
public class If04{
    public static void main(String []args) {
	Scanner myScanner = new Scanner(System.in);
	System.out.println("your score:");
	int grade = myScanner.nextInt();
	if(grade >8){
		System.out.println("final entered");
		System.out.println("your gender:");
		char gender = myScanner.next().charAt(0);
		if(gender == 'M'){System.out.println("male final");}
		else if(gender == 'F'){System.out.println("female final");}
	}else{System.out.println("get out of here");}
}}