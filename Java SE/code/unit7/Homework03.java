public class Homework03 {
    public static void main(String []args) {
      Book b = new Book(200.0);
		//b.price  = 200;
		b.updatePrice();
		System.out.println(b.price);
    }
}
class Book{
	double price;
	public Book(double price){
		this.price = price;
}
	public void updatePrice(){
		if(this.price>150){this.price = 150;}
		else if(this.price>100){this.price = 100;}
		//else{this.price = this.price;}
	}
}