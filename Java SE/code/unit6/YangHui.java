public class YangHui {
    public static void main(String []args) {
		int[][] arr = new int[10][];
		for(int i = 0; i < arr.length; i++){//every line
			arr[i] = new int[i+1];
			for(int j = 0 ; j < arr[i].length; j++){//every element
				if(j==0||j==arr[i].length-1){
					arr[i][j] = 1;
				}else{
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
			}
		}
		for(int i = 0; i < arr.length; i++){//2D
			for(int j = 0 ; j < arr[i].length; j++){
				System.out.print(arr[i][j]+"\t");
			}System.out.println();
		}
    }
}