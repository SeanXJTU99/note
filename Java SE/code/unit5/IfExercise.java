//import java.util.Scanner;
public class IfExercise{
    public static void main(String []args) {
//1
	double d1 = 34.5;
	double d2 = 2.6;
	if (d1 > 10 && d2 <20) System.out.println(d1+d2);
//2
	int n1 =5;
	int n2 =6;
	int n3 = n1 +n2;
	if(n3%3==0 && n3 % 5 ==0){System.out.println("yes");}
	else{System.out.println("no");}	
//3
	int year = 2000;
	if((year % 4 ==0 && year %100!=0)||year % 400 ==0){
		System.out.println("run nian");
	}	
	else{System.out.println("not run nian");}
}}
