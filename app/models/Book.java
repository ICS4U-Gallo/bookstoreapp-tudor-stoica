package models;

public class Book {

    public Integer id;
    public Integer price;
    public String title;
    public String author;

    public Book (Integer id, Integer price, String title, String author){
        this.id = id;
        this.price = price;
        this.title = title;
        this.author = author;
    }

    private static Set<Book> books;

    static {
        books = new HashSet<>();
        books.
    }

}
