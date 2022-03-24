public class ArrayAdd{
    public static void main(String []args) {
		int[] arr = {1,2,3};//static assignment
		int len = arr.length;
		int[] arr2 = new int[len+1];
		for(int i = 0; i< len; i ++){
			arr2[i]  = arr[i];
		}
		arr2[len] = 4;
		arr = arr2;
		for(int i = 0; i <=len;i++){
			System.out.print(arr[i]+ " ");
		}
    }
}