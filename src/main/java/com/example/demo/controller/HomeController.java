package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//Annotation to let Spring know that this is a controller class
@Controller
public class HomeController {



    //get the mapping for index (home) page
    @GetMapping("/")
    public String index(Model model){
        //In order to make it work we need to create a "home" directory inside "Templates" inside "resources".
        // Once the folder is called "templates.home" create an "index.html" file inside
        return "home/index";
    }

}

