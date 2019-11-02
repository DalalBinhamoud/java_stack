package com.dalal.stringsAssignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication

@RestController
public class StringsAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsAssignmentApplication.class, args);
	}
	
	@RequestMapping("/")
   
    public String hello() {
            return "Hello Client How Are you doing?";
    }
	
	@RequestMapping("/random")
 
    public String hello2() { 
            return "Spring Boot is great! so easy to just respond with stings";
    }

}
