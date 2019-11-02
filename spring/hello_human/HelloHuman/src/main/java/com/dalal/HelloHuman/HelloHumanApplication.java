package com.dalal.HelloHuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class HelloHumanApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);
	}
	
	@RequestMapping("/")
    public String index(@RequestParam(value="fname", required=false) String query,@RequestParam(value="last_name", required=false) String query2) {
		
		if(query == null)
			query = "Human";
        return "<h1>Hello "+ query+" "+query2+"!</h1> <p> Welcome to Spring Boot!</p>";
    }

}
