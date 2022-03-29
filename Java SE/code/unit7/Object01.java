public class Object01 {
    public static void main(String []args) {
		/*String cat1Name = "bai";
		String cat2Name = "hua";
		int cat1Age = 3;
		int cat2Age = 100;
		String cat1Color = "B";
		String cat2Color = "H";
		String[] cat1 = {"bai","3","B"};
		String[] cat2 = {"hua","100","H"};
		*/
		Cat cat1 = new Cat();
		cat1.name = "bai";
		cat1.age = 3;
		cat1.color = "B";
		cat1.weight = 10;
		Cat cat2 = new Cat();
		cat2.name = "hua";
		cat2.age = 100;
		cat2.color = "H";
		cat2.weight = 20;
		System.out.println(cat1.name+" "+cat1.age+" "+cat1.color+" "+cat1.weight);
    }
}

//OOP
class Cat{
	String name;
	int age;
	String color;
	double weight;
}