public class This01 {
    public static void main(String []args) {
		Person p1 = new Person("jack", 80);
		Person p2 = new Person();
		System.out.println(p1.age);
		System.out.println(p2.age);
    }
}
class Person{
	int age;
	String name;
	public Person(String pName, int pAge){
		name = pName;
		age = pAge;
	}
	public Person(){
		age = 18;
	}
}