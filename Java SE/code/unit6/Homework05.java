public class Homework05{
    public static void main(String []args) {
		//random number
		int[] arr = new int[10];
		for(int i= 0; i<arr.length;i++){
			arr[i] = (int)(Math.random() * 100)+1;
		}
		System.out.println();
		for(int i = arr.length-1; i>=0; i--){
			System.out.println(arr[i]+ "\t");
		}
		
		//max,ave,maxIndex
		int max = arr[0];
		int maxIndex = 0;
		double total = arr[0];
		for (int i=1;i<arr.length;i++){
			total += arr[i];
			if(max<arr[i]){
				max = arr[i];
				maxIndex = i;
			}
		}
		System.out.println("max=" + max + " maxIndex=" +
						   maxIndex + " average=" + total/arr.length);
		
		//search 8
		int findNum = 8;
		int index =-1;
		for(int i= 0; i<arr.length; i++){
			if(findNum == arr[i]){
				System.out.println(i);
				index = i;
				break;
			}
		}
		if(index ==-1){
			System.out.println("8 not found.");
		}
	}
}