public class ArrayReverse02 {
    public static void main(String []args) {
		int[] arr = {11,22,33,44,55,6};
		
		int len = arr.length;
		int[] arr2 = new int[len];
		for(int i = len-1,  j = 0; i>=0; j++, i--){
			arr2[j]= arr[i];
		}
		arr = arr2; // assign data space of arr2 to arr, the orignal space of arr will be panished
		for(int i = 0; i< len;i++){
			System.out.print(arr2[i] + " ");
		}
    }
}