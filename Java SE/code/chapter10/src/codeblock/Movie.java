package codeblock;

class Movie {
    private String name;
    private double price;
    private String director;

    public Movie(String name) {
        System.out.println("movie started.");
        this.name = name;
    }

    public Movie(String name, double price) {
        System.out.println("movie started.");
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        System.out.println("movie started.");
        this.name = name;
        this.price = price;
        this.director = director;
    }
    {
        System.out.println("movie started.");
    }
}
