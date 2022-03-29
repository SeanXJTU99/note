public class MethodDetail02 {
    public static void main(String []args) {
		A a = new A();
		a.sayok();a.m1();
    }
}
class A{
	public void print(int n){
		System.out.println("print method is used." + n);
	}
	public void sayok(){
		print(10);System.out.println("sayok method is used.");
	}
	public void m1(){
		B b =new B();System.out.println("m1 method is used.");
		b.hi();
		System.out.println("m1 going.");
	}
}
class B{public void hi(){System.out.println("hi");}}