package com.springboot.maven.jsp.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description HelloRestController
 *
 * @author aji gojali
 */
@RestController
@RequestMapping("/hello")
public class HelloRestController {

    @GetMapping("")
    public String hello(){
        return "Hello world!";
    }
}
