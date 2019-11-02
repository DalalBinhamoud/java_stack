package com.dalal.gettingFamilliar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/coding")
public class GettingFamilliarApplication {

	public static void main(String[] args) {
		SpringApplication.run(GettingFamilliarApplication.class, args);
	}

   
    public String index(){
      return "Hello Coding Dojo!";
    }
    @RequestMapping("/python")
    public String hello(){
      return "Python/Django was awesome!";
    }
    @RequestMapping("/java")
    public String world(){
      return "Java/Spring is better!";
    }
}
