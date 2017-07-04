package ua.mega.avalon.data;

import ua.mega.avalon.domain.Book;

import java.util.List;

public interface BookDao
{
	   public List<Book> allBooks();
	   public Book findByIsbn(String isbn) throws BookNotFoundException;
	   public void create(Book newBook);
	   public void delete(Book redundantBook);
	   public List<Book> findBooksByAuthor(String author);   
}
