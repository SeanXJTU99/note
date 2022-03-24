public class Homework04 {
    public static void main(String []args) {
		int[] arr = {10,12,45,90};
		int insertNum = 23;
		int index = -1; // position of insert
		for(int i =0 ; i< arr.length; i++){
			if(insertNum <= arr[i]){
				index= i;
				break;
			}
		}
		if(index == -1){index = arr.length;}
		int[] arr2 = new int[arr.length+1];
		for (int i = 0, j= 0; i <arr2.length; i++){
			if( i != index){
				arr2[i] = arr[j];
				j++;
			}else{
				arr2[i] = insertNum;
			}
		}
		arr = arr2;
		System.out.println("=====arr after inserting=====");
		for (int i=0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}