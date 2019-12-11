package com.springboot.maven.jsp.controller.view;

import com.springboot.maven.jsp.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Description BookViewController
 *
 * @author aji gojali
 */
@Controller
@RequestMapping(value = {"/books"})
public class BookViewController {
    @Autowired
    private BookService bookService;

    @GetMapping(value = {"/index",""})
    public String index(HttpServletRequest request){
        request.setAttribute("books",bookService.findAllBooks());
        return "index";
    }
}
