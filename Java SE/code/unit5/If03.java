import java.util.Scanner;
public class If03{
    public static void main(String []args) {
	Scanner myScanner = new Scanner(System.in);
	System.out.println("your grade:");
	int grade = myScanner.nextInt();
	if(grade >=1 && grade <=100){
	if(grade == 100){System.out.println("perfect");}
	else if(grade >80 && grade <=99){System.out.println("good");}
	else if(grade >60 && grade <=80){System.out.println("not bad");}
	else{System.out.println("bad");}}
	else{System.out.println("grade should in range of 100, reinput plz ^_^");}
}}
