import java.util.Scanner;
public class ArrayAdder{
    public static void main(String []args) {
		Scanner myScanner = new Scanner(System.in);
		int[] arr = {1,2,3};//static assignment
		do{
			int len = arr.length;
			int[] arr2 = new int[len+1];
			for(int i = 0; i< len; i ++){
				arr2[i]  = arr[i];
			}
			System.out.print("input number to add:");
			int addNum = myScanner.nextInt();
			arr2[len] = addNum;
			arr = arr2;
			System.out.print("===========arr========\n");
			for(int i = 0; i <=len;i++){
				System.out.print(arr[i]+ "\t");
			}
			System.out.print("\nwanna add?");
			char ans = myScanner.next().charAt(0);
			if(ans == 'n'){
				break;
			}
		}while(true);
		System.out.print("Adder quited.");
    }
}