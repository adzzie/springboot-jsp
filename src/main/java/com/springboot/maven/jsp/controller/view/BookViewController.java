package com.springboot.maven.jsp.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description BookViewController
 *
 * @author aji gojali
 */
@Controller
@RequestMapping(value = {"/books"})
public class BookViewController {
    @GetMapping(value = {"/index",""})
    public String index(){
        return "book";
    }
}
