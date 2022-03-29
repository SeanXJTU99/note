public class Homework02 {
    public static void main(String []args) {
		A02 a = new A02();
		String[] arr = {"1","2","3"};
		String str = "5";
		int index = a.find(arr, str);
		System.out.println(index);
    }
}
class A02{
	public int find(String[] arr, String s){
		//int n = -2;
		if(arr != null && arr.length >0){
			for(int i=0;i<arr.length;i++){
				if(s.equals(arr[i])){
					return i;//n = i;break;
				}
			}
			return -1; //return n+1;
		}else{return -1;}
	}
}