package com.springboot.maven.jsp.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description IndexController
 *
 * @author aji gojali
 */
@Controller
@RequestMapping(value = {"/",""})
public class IndexController {

    @GetMapping("")
    public String index(){
        return "index";
    }
}
