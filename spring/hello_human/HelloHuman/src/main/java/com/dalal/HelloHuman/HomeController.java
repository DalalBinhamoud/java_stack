package com.dalal.HelloHuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class HomeController {
	@RequestMapping("/")
    public String index(@RequestParam(value="q", required=false) String searchQuery) {
        return "You searched meme for: " + searchQuery;
    }
}
