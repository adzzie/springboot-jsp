package com.springboot.maven.jsp.controller.rest;

import com.springboot.maven.jsp.entity.Book;
import com.springboot.maven.jsp.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

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

    @GetMapping("/get_all_book")
    public Collection<Book> getAllBooks(){
        return bookService.findAllBooks();
    }

    @GetMapping("/delete")
    public void delete(@RequestParam String id){
        bookService.delete(id);
        System.out.println("delete");
    }
}
