package com.springboot.maven.jsp.controller.rest;

import com.springboot.maven.jsp.entity.Book;
import com.springboot.maven.jsp.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

/**
 * Description BookRestController
 *
 * @author aji gojali
 */
@RestController
@RequestMapping(value = {"/rest/books"})
public class BookRestController {

    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public Collection<Book> getAllBooks(){
        return bookService.findAllBooks();
    }

    @GetMapping("/page")
    public Page<Book> findAllBooks(Pageable pageable){
        return bookService.findAllBooks(pageable);
    }

    @GetMapping("/{id}")
    public Book findById(@PathVariable("id") Book b){
        return b;
    }

    @GetMapping("/get/{id}")
    public Optional<Book> findById(@PathVariable("id") String id){
        return bookService.findById(id);

    }

    @GetMapping("/delete")
    public void deleteBook(@RequestParam String id){
        System.out.println("delete");
        bookService.delete(id);
    }
}
