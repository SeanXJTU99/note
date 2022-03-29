public class This02 {
    public static void main(String []args) {
	T t1 = new T();
	t1.f3();
		
    }
}
class T{
	String name;
	public T(){
		this("spike",3);
		System.out.println(" T()");
	}
  public T(String name, int age){
	this.name = name;
    System.out.println(" T(String name, int age)"); }
public void f3(){
  String name = "smith";
  System.out.println("name = "+name);
  System.out.println("name =" +this.name);}
}