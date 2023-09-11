package org.learning.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//identifica la classe come controller

@RequestMapping("/")


public class IndexController {

    @GetMapping("/homepage")
    public String Index () {
        return "homepage";
    }

    @GetMapping("/about")
    public String Indextwo () {
        return "aboutus";
    }

    @GetMapping("/terms-and-conditions")
    public String Indexthree (){
        return "terms-and-conditions";
    }

}
