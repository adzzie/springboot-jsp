package com.springboot.maven.jsp.services;

import com.springboot.maven.jsp.dao.BookDao;
import com.springboot.maven.jsp.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

/**
 * Description BookService
 *
 * @author aji gojali
 */
@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public Collection<Book> findAllBooks(){
        List<Book> books = new ArrayList<Book>();
        for (Book book: bookDao.findAll()) {
            books.add(book);
        }
        return books;
    }

    public Page<Book> findAllBooks(Pageable page){
        return bookDao.findAll(page);
    }

    public Optional<Book> findById(String id){
        return bookDao.findById(id);

    }

    public void delete(String id){
        bookDao.deleteById(id);
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
