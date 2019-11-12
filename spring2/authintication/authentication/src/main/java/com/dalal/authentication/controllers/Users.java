package com.dalal.authentication.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dalal.authentication.models.User;
import com.dalal.authentication.services.UserService;

@Controller
public class Users {
    private final UserService userService;
    
    public Users(UserService userService) {
        this.userService = userService;
    }
    
    @RequestMapping("/registration")
    public String registerForm(@ModelAttribute("user") User user) {
        return "/user/registrationPage.jsp";
    }
    @RequestMapping("/login")
    public String login() {
        return "/user/loginPage.jsp";
    }
    
    @RequestMapping(value="/registration", method=RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
        if(result.hasErrors()) {
        	return "/user/registrationPage.jsp";
        }
        User theuser = userService.registerUser(user);
        session.setAttribute("userId", theuser);
        return "redirect:/home";
    }
    
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
        boolean flag = userService.authenticateUser(email, password);
        
        if(flag) {
        	User theuser = userService.findByEmail(email);
            session.setAttribute("userId", theuser.getId());
            return "redirect:/home";
        }
        else {
        	model.addAttribute("error", "try again");
        	return "/user/loginPage.jsp";
        }
    }
    
    @RequestMapping("/home")
    public String home(HttpSession session, Model model) {
        Long userID = (Long) session.getAttribute("userId");
        User theuser = userService.findUserById(userID);
        model.addAttribute("user", theuser);
    	return "/user/homePage.jsp";
        
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
    	session.invalidate();
    	return"redirect:/login";
    }
}