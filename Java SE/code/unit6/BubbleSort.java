public class BubbleSort{
    public static void main(String []args) {
		int[] arr = {6,5,4,3,2,1};
		int len = arr.length-1;
		for(int j = 0; j < len;j++){
			for(int i = 0; i < len-j;i++){//4times
				if(arr[i] > arr[i+1]){
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			System.out.println("====="+j+"=====");
			for(int i = 0; i < arr.length;i++)System.out.print(arr[i]+"\t");
		}
    }
}