package com.dalal.code;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class homeController {

	@RequestMapping("/")
	 public String index() {
        return "index.jsp";
  }
	
	
	
	@RequestMapping(value="/showCode", method=RequestMethod.POST)
	 public String login(@RequestParam(value="name") String name) {
        if(name.contentEquals("bushido"))
         return "redirect:/code";
        else return "redirect:/showError";
   }
	
	@RequestMapping("/code")
	 public String code() {
   
        return "code.jsp";
  }
	
	@RequestMapping("/showError")
	public String flashMessages(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", "You Must Train Harder!");
        return "redirect:/";
	}
}
