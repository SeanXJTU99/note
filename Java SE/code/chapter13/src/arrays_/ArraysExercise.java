package arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0]  = new Book("a",10);
        books[1]  = new Book("b",4);
        books[2]  = new Book("c",15);
        books[3]  = new Book("d",6);

        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                Book book1 = (Book)o1;
                Book book2 = (Book)o2;
                double priceDif = book2.getPrice() - book1.getPrice();
                if(priceDif>0){
                    return 1;
                }else if(priceDif<0){
                    return -1;
                }else{
                    return 0;
                }
            }
        });
        System.out.println(Arrays.toString(books));;

    }
}
class Book{
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
