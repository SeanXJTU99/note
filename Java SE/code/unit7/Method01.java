public class Method01 {
    public static void main(String []args) {
		Person p1 = new Person();
		p1.speak();
		p1.cal01();
		p1.cal02(5);
		int returnRes  = p1.getSum(10,20);
		System.out.print(returnRes);
		//System,out.println(cat1.name+" "+ca1.age+" "+cat1.color+" "+cat1.weight);
    }
}

//OOP
class Person{
	int age;
	String name;
	//method
	public void speak(){
		System.out.println("a nice person");
	}
	public void cal01(){
		int res = 0;
		for(int i =1; i<=1000; i++){
			res += i;
		}
		System.out.println(res);
	}
	public void cal02(int n){
		int res = 0;
		for(int i =1; i<=n; i++){
			res += i;
		}
		System.out.println("cal02="+res);
	}
	public int getSum(int n1, int n2){
		int res = n1 + n2;
		return res;
	}
}