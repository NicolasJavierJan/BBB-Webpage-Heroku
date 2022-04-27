package com.example.demo.controller;

import com.example.demo.Boy;
import com.example.demo.BoyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//Annotation to let Spring know that this is a controller class
@Controller
public class HomeController {
    //get the mapping for index (home) page

    @Autowired
    private BoyService boyService;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/")
    public String index(Model model){
        //In order to make it work we need to create a "home" directory inside "Templates" inside "resources".
        // Once the folder is called "templates.home" create an "index.html" file inside
        List<Boy> boyList = boyService.fetchAll();
        model.addAttribute("boys", boyList);
        return "home/index";
    }

    @GetMapping("/viewUser/{id}")
    public String viewUser(@PathVariable("id") int id, Model model) {
        model.addAttribute("boy", boyService.findUserById(id));
        return "home/viewUser";
    }
}
