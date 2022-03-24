public class ArrayReverse {
    public static void main(String []args) {
		int[] arr = {11,22,33,44,55,6};
		int len = arr.length;
		for(int i = 0; i< len/2;i++){
			int temp = arr[len-i-1];
			arr[len-1-i] = arr[i];
			arr[i] = temp;
		}
		for(int i = 0; i< len;i++){
			System.out.print(arr[i] + " ");
		}
    }
}