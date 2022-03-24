public class ArrayCopy {
    public static void main(String []args) {
		int[] arr1 = {10,20,30};        //arr1->0x0011
		int[] arr2 = new int[arr1.length];//arr2->0x0022
		//arr1->arr2
		for(int i = 0; i< arr1.length; i++){
			arr2[i] = arr1[i];
		}
		arr2[0] = 80;
		System.out.println("=====arr1 element=====");
		for (int i = 0; i < arr1.length; i ++){
			System.out.print(arr1[i] + " ");
		}
		System.out.println("\n=====arr2 element=====");
		for (int i = 0; i < arr2.length; i ++){
			System.out.print(arr2[i] + " ");
		}
		
    }
}