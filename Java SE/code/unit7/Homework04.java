public class Homework04 {
    public static void main(String []args) {
		double[] arr = {1,2,3};
		A03 a = new A03();
		double[] narr = a.copyArray(arr);
		for(int i=0;i<narr.length;i++){
			System.out.print(narr[i]+" ");
		}System.out.println();
    }
}
class A03{
	public double[] copyArray(double[] arr){
		int len = arr.length;
		double[] narr = new double[len];
		for(int i=0;i<len;i++){
			narr[i] = arr[i];
		}
		return narr;
	}
}