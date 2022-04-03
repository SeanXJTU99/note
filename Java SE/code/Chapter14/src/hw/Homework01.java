package hw;

import java.util.ArrayList;
import java.util.Collections;

public class Homework01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new News("123832953208570385278w5"));
        arrayList.add(new News("456832958235"));
        Collections.reverse(arrayList);
        for (Object obj : arrayList) {
//            News news = (News) obj;
//            System.out.println(news);
            System.out.println(obj);
        }

    }
}

class News {
    private String title;
    private String cont;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }

    public News(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        String title_cont;
        if (title.length() >= 15) {
            title_cont = title.substring(0, 15) + "...";
        } else {

            title_cont = title;
        }
        return title_cont;
    }
}