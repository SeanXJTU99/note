public class VarScope {
    public static void main(String []args) {
		Cat cat1 = new Cat();
		Person p1 = new Person();
		cat1.test();
		cat1.eat(p1);
    }
}
class Cat{
	public void test(){
		Person p1 = new Person();
		System.out.println(p1.age);
	}
	public void eat(Person p){
		System.out.println(p.age);
	}
}
class Person{
	int age = 10;
}