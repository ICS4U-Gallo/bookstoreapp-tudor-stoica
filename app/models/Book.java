package models;

import java.util.HashSet;
import java.util.Set;

public class Book {

    public Integer id;
    public Integer price;
    public String title;
    public String author;

    public Book(){}

    public Book (Integer id, Integer price, String title, String author){
        this.id = id;
        this.price = price;
        this.title = title;
        this.author = author;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getPrice(){
        return price;
    }

    public void setPrice(Integer price){
        this.price = price;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    private static Set<Book> books;

    static {
        books = new HashSet<>();
        books.add(new Book(1, 20, "C++", "ABC"));
        books.add(new Book(2, 30, "Java", "XYZ"));
    }

    public static Set<Book> allBooks(){
        return books;
    }

    public static Book findById(Integer id){
        for (Book book : books){
            if (id.equals(book.id)){
                return book;
            }
        }
        return null;
    }

    public static void add(Book book){
        books.add(book);
    }

    public static boolean remove(Book book){
        return books.remove(book);
    }
}
