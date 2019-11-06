package com.dalal.counter;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class homecontroller {

	  
	  @RequestMapping("/")
	   public String counter(HttpSession session,Model model){
		  
		  if(session.getAttribute("count")==null)
		        session.setAttribute("count", 0);
		  
		  Integer count = (Integer) session.getAttribute("count");
		  
	       String str = "you visited https://localhost:8080   " + count+" times.";
	       
	       model.addAttribute("counter", str);
	        return "index.jsp";
	    }
	  
	  
	  @RequestMapping("/counter")
	   public String index(HttpSession session){
		  
		  if(session.getAttribute("count")==null)
	        session.setAttribute("count", 0);
		  else {
			  Integer count = (Integer) session.getAttribute("count");
			  session.setAttribute("count", count+1);
		  }
	       
	        return "counter.jsp";
	    }
}
