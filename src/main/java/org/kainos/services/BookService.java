package org.kainos.services;

import org.kainos.daos.BookDao;
import org.kainos.models.Book;

import java.sql.SQLException;
import java.util.List;

public class BookService {
    BookDao bookDao;

    public BookService(final BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public List<Book> getAllBooks() throws SQLException {
        return bookDao.getAllBooks();
    }

    public Book getBookById(final int id) throws SQLException {
        return bookDao.getBookById(id);
    }
}
