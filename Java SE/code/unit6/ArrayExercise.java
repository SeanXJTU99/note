public class ArrayExercise{
	public static void main(String []args) {
		/*char[] arpb = new char[26];
		//'A'+1='B'
		for (int i =0; i< arpb.length; i++){
			arpb[i] = (char)('A' + i);
			System.out.print(arpb[i]+" ");
		}*/
		int[] arr ={4,-1,9,0,10,23};
		int max = arr[0];
		int maxIndex = 0;
		for (int i =1; i<arr.length; i++){
			if(max<arr[i]){
				max = arr[i];
				maxIndex= i;
			}
		}System.out.print(max +"\n"+ maxIndex);
	}
}