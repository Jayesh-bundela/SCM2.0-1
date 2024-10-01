package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PageController {
  
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name", "Jayesh");
		model.addAttribute("gameName", "Yodha-Jayesh");
		//System.out.println("Home Page Handeler");
		return "home";
	}
	
//about route
	@RequestMapping("/about")
	public String aboutPage() {
		
		return "about";
	}
	
	
//services	
	@RequestMapping("/services")
	public String services() {
		
		return "services";
	}
	
// contact page
	@GetMapping("/contact")
    public String contact() {
		
		return new String("contact");
	}
	
// login page
	@GetMapping("/login")
	   public String login() {
			
			return new String("login");
		}
	
//register
	@GetMapping("/register")
	   public String register() {
			
			return "register";
		}
}
