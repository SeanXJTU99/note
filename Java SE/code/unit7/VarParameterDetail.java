public class VarParameterDetail {
    public static void main(String []args) {
		double[] arr = {1,2,3};
		T t1 = new T();
		t1.f2(1.0, arr);
    }
}
class T{
	/*public int sum(int n1, int n2){
		return n1+n2;		
	}
	public void f1(int... nums){
		System.out.println();
	}*/
	public void f2(double a, double... nums){
		for(int i = 0; i< nums.length; i++){
		System.out.print(nums[i]);}
	}
}