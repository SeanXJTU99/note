package List;

import collection.Book;
import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {
        List books = new ArrayList();
        for (int i = 0; i < 12; i++) {
            books.add(new Book(i+"", Math.random()));
        }

        int booksSize = books.size();//提前计算长度，提高效率
        for (int i = 0; i < booksSize - 1; i++) {
            for (int j = 0; j < booksSize - 1 - i; j++) {
//                if (books.get(j))无法直接使用getPrice
                Book book1 = (Book)books.get(j);
                Book book2 = (Book)books.get(j+1);
                if (book1.getPrice() < book2.getPrice()){
                    books.set(j,book2);
                    books.set(j+1,book1);
                }

            }
        }
        for (Object book :books) {
            System.out.println(book);
        }

    }
}

