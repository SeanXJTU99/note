public class TwoDimensionalArray {
    public static void main(String []args) {
		int[][] arr = new int[2][3];
		arr[1][1] = 8;
		for(int i = 0; i < arr.length; i++){//2D
			for(int j = 0 ; j < arr[i].length; j++){
				System.out.print(arr[i][j]+"\t");
			}System.out.println();
		}
    }
}