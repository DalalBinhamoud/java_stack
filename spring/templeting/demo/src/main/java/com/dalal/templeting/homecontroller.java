package com.dalal.templeting;


import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller

public class homecontroller {
	  @RequestMapping("/Date")
      // 3. Method that maps to the request route above
      public String hello(Model model) { // 3
		  SimpleDateFormat formatter = new SimpleDateFormat("EEE 'the' dd 'of' MMMM',' yyyy");  
		  model.addAttribute("theDate",formatter.format(new java.util.Date()));
              return "index.jsp";
    
}
	  
	  @RequestMapping("/time")
      // 3. Method that maps to the request route above
      public String helloTime(Model model) { // 3
		  
		 
		  SimpleDateFormat formatter2 = new SimpleDateFormat("hh:mm a");  
		  model.addAttribute("theTime",formatter2.format(new java.util.Date()));
              return "time.jsp";
    
}
}

