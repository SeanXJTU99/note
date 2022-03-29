public class Constructor {
    public static void main(String []args) {
		Person p1 = new Person("jack", 80);
		Cat c1 = new Cat();
		System.out.println(p1.age);
		System.out.println(c1.age);
    }
}
class Cat{
	int age;
	int weight;
}
class Person{
	int age;
	String name;
	public Person(String pName, int pAge){
		name = pName;
		age = pAge;
	}
}