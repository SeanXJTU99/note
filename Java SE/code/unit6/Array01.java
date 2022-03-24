public class Array01{
	public static void main(String []args) {
		double[] hens = {3,5,1,2,3.4,50, 90, 80};
		double total = 0;
		int len = hens.length;
		for (int i = 0; i < len ; i++){
			total += hens[i];
			//System.out.println("No."i+1 + " weight is " + hens[i]);
		}
		double ave = total/len;
		System.out.println(ave);
	}
}