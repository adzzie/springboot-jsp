package com.springboot.maven.jsp.services;

import com.springboot.maven.jsp.dao.BookDao;
import com.springboot.maven.jsp.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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

    public void delete(String id){
        bookDao.deleteById(id);
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
