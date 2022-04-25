package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
public class DemoApplication {

	@RequestMapping("/")
	@ResponseBody
	public String index(Model model){
		//In order to make it work we need to create a "home" directory inside "Templates" inside "resources".
		// Once the folder is called "templates.home" create an "index.html" file inside
		return "home/index";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

