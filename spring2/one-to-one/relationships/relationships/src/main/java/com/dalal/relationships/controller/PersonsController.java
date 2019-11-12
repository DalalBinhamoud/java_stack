package com.dalal.relationships.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dalal.relationships.DataService.LicenseService;
import com.dalal.relationships.DataService.PersonService;
import com.dalal.relationships.models.License;
import com.dalal.relationships.models.Person;



@Controller
public class PersonsController {
	 private final PersonService personService;
	 private final LicenseService licenseService;
	    
	 public PersonsController(PersonService personService,LicenseService licenseService) {
	        this.personService = personService;
	        this.licenseService = licenseService;
	    }
	  @RequestMapping("/license/new")
	   public String newLicense(@ModelAttribute("license") License license,Model model) { 	  		  
	  List<Person> persons = personService.allPersons();
       model.addAttribute("persons", persons);	
       return "/persons/newLicense.jsp";
   }
	 
	  
	  
  
	  @RequestMapping(value="/licenses/new", method=RequestMethod.POST)
	    public String create(@Valid @ModelAttribute("license") License license, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/persons/newLicense.jsp";
	        } else {
	        	licenseService.createLicense(license);
	            return "redirect:/persons/new";
	        }
	  
	    }
	  

	  
	  
	    @RequestMapping("/persons/new")
	    public String newPerson(@ModelAttribute("person") Person person) {
	    	
	        return "persons/newPerson.jsp";
	    }
	    
	    
	    @RequestMapping(value="/persons/createPerson", method=RequestMethod.POST)
	    public String create(@Valid @ModelAttribute("person") Person person, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/persons/newPerson.jsp";
	        } else {
	        	Person p= personService.createPerson(person);
	            return "redirect:/persons/"+p.getId();
	        }
	    }
	 
	    @RequestMapping("/persons/{id}")
	    public String show(@PathVariable("id")Long id,Model model) {	
	        Person person = personService.findPerson(id);
	        model.addAttribute("person", person);
	        return "/persons/show.jsp";
	    }
	  
	 
}
