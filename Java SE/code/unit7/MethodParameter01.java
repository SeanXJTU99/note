public class MethodParameter01 {
    public static void main(String []args) {
		int a=10;int b= 20;
		AA obj= new AA();
		obj.swap(a,b);
		System.out.println(a);
		System.out.println(b);
    }
}
class AA{
	public void swap(int a,int b){
		System.out.println(a);
		int tmp=a;a=b;b=tmp;
		System.out.println(a);}}