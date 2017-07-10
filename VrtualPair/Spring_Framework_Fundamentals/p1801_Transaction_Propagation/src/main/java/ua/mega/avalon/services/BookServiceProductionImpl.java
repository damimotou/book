package ua.mega.avalon.services;

import org.springframework.transaction.annotation.Transactional;
import ua.mega.avalon.data.BookDao;
import ua.mega.avalon.data.BookNotFoundException;
import ua.mega.avalon.domain.Book;

import java.util.List;

@Transactional
public class BookServiceProductionImpl implements BookService {

    private BookDao dao;

    public BookServiceProductionImpl(BookDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Book> getAllBooksByAuthor(String author) {
        return dao.findBooksByAuthor(author);
    }

    @Override
    public List<Book> getAllRecommendedBooks(String userId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Book getBookByIsbn(String isbn) throws BookNotFoundException {
        return dao.findByIsbn(isbn);
    }

    @Override
    public List<Book> getEntireCatalogue() {
        return dao.allBooks();
    }

    @Override
    public void registerNewBook(Book newBook) {
        dao.create(newBook);
    }

    @Override
    public void deleteFromStock(Book oldBook) {
        dao.delete(oldBook);
    }
}
