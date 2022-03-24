public class TwoDimensionalArray03 {
    public static void main(String []args) {
		int[][] arr = new int[3][];
		for(int i = 0; i < arr.length; i++){//2D
			//every array new space
			arr[i] = new int[i+1];
			for(int j = 0 ; j < arr[i].length; j++){
				arr[i][j] = i+1;
			}
		}
		//output
		for(int i = 0; i < arr.length; i++){//2D
			for(int j = 0 ; j < arr[i].length; j++){
				System.out.print(arr[i][j]+"\t");
			}System.out.println();
		}
    }
}