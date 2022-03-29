public class Homework01 {
    public static void main(String []args) {
		A01 a = new A01();
		//double[] arr = {1.1,4.7,8.0};
		//double[] arr = {};
		double[] arr = null;
		Double res = a.max(arr);
		if(res != null){
		System.out.println(a.max(arr));}
		else{
			System.out.println("get out");
		}
    }
}
class A01{
	public Double max(double[] arr){
		if (arr != null && arr.length>0){
		double max = arr[0];
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
				max = arr[i];
			}
		}return max;}
		else{return null;}
	}
}