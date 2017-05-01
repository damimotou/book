package ua.mega.domain;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private String author;
    private double price;

    public Book() {
    }

    public Book(String isbn, String title, String author, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(int id, String isbn, String title, String author, double price) {
        this(isbn, title, author, price);
        this.id = id;
    }

    @Override
    public String toString() {
        return this.title + " by " + this.author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}