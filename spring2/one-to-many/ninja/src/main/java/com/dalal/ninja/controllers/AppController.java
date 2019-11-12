package com.dalal.ninja.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dalal.ninja.models.Dojo;
import com.dalal.ninja.models.Ninja;
import com.dalal.ninja.services.DojoService;
import com.dalal.ninja.services.NinjaService;

@Controller
public class AppController {
	
	 private final DojoService dojoService;
	 private final NinjaService ninjaService;
	    
	 public AppController(DojoService dojoService,NinjaService ninjaService) {
	        this.dojoService = dojoService;
	        this.ninjaService = ninjaService;
	    }
	 
	 
	  @RequestMapping("/dojos/new")
	  public String newDojo(@ModelAttribute("dojo") Dojo dojo) { 	  		  	
      return "/dojos/new.jsp";
  }

	  @RequestMapping(value="/dojos/createDojo", method=RequestMethod.POST)
	    public String create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/dojos/new.jsp";
	        } else {
	        	dojoService.createDojo(dojo);
	            return "redirect:/ninjas/new";
	        }
	    }
	  
	  
	  @RequestMapping("/ninjas/new")
	  public String newNinja(@ModelAttribute("ninja") Ninja ninja,Model model) { 	
		  List<Dojo> dojos = dojoService.allDojos();
	      model.addAttribute("dojos", dojos);  		  
      return "/ninjas/new.jsp";
  }
	  
	  
	  @RequestMapping(value="/ninjas/new", method=RequestMethod.POST)
	    public String create(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/ninjas/new.jsp";
	        } else {
	        	//Dojo d = dojoService.findDojo(id);
	        	ninjaService.createNinja(ninja);
	            return "redirect:/dojos/new"; // show
	        }
	  
	    }
	  
	   @RequestMapping("/dojos/{id}")
	    public String show(@PathVariable("id")Long id,Model model) {	
		   Dojo d = dojoService.findDojo(id);
	        model.addAttribute("dojo", d);
	        List<Ninja> ninjas = d.getNinjas();
	        model.addAttribute("ninjas", ninjas);
	        return "/dojos/show.jsp";
	    }
	  
	  
}
