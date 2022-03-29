public class This01 {
    public static void main(String []args) {
		Dog d = new Dog("spike",3);
		System.out.println(d.name);
		System.out.println(d.hashCode());
    }
}
class Dog{
  String name;
  int age;
  public Dog(String name, int age){
    this.name = name;
	this.age = age; System.out.println(this.hashCode());}
}