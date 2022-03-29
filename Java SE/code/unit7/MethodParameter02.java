public class MethodParameter02 {
    public static void main(String []args) {
		B b= new B();
		int[] arr = {1,2,3};
		b.test100(arr);
		System.out.println("arr from main:");
		for(int i=0;i<arr.length;i++){System.out.println(arr[i]+"\t");}
		Person p = new Person();
		p.name = "jack";
		p.age = 10;
		b.test200(p);
		System.out.println(p.age);
    }
}
class B{
	public void test100(int[] arr){
		arr[0] = 200;
		for(int i=0;i<arr.length;i++){System.out.println(arr[i]+"\t");}}
	public void test200(Person p){p.age = 200;}
}
class Person{int age; String name;}