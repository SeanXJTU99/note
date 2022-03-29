public class MethodExercise02 {
    public static void main(String []args) {
		B b= new B();
		Person p = new Person();
		p.name = "jack";
		p.age = 10;
		Person p2 = b.copyPerson(p);
		System.out.println(p2.age);
    }
}
class B{
	public Person copyPerson(Person p){
		Person p2 = new Person();
		p2.name = p.name;
		p2.age = p.age;
		return p2;
	}
}
class Person{int age; String name;}