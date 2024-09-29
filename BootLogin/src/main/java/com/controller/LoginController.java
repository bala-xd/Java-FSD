package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.User;
import com.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {
	@Autowired
	private UserService service;
	
	@RequestMapping("/")
	public String home(HttpSession ses, Model m) {
		User user = (User) ses.getAttribute("user");
		if (user!=null) m.addAttribute("msg", "Welcome, " + user.getUserName()+"!");
		return "index";
	}
	
	@GetMapping("/reg")
	public String register() {
		return "register";
	}
	
	@PostMapping("/add")
	public String addUser(Model m, User u) {
		String uid = service.createUser(u);
		m.addAttribute("msg", "User with id: " + uid + " has been added!");
		return "index";
	}
	
	@GetMapping("/login")
	public String login(HttpSession ses) {
		if (ses.getAttribute("user")!=null) return "redirect:/";
		return "login";
	}
	
	@PostMapping("/login")
	public String login(Model m, HttpSession ses, User u) {
		User user = service.validateUser(u);
		String view = "index";
		if(user!=null && user.getLoginStatus()==0) {
			service.updateLoginStatus(user);
			ses.setAttribute("user",user);
			m.addAttribute("msg", "Welcome, " + user.getUserName()+"!");
		}
		else {
			if(user !=null) {
				ses.setAttribute("user",user);
				m.addAttribute("msg", user.getUserName() +" has already logged in!");
			}
			else {
				m.addAttribute("msg", "Invalid Username or Password!");
				view = "login";
			}
		}
		return view;	
	}
	
	@GetMapping("/profile")
	public String getProfile(Model m, HttpSession ses) {
		User user = (User) ses.getAttribute("user");
		String view= "profile";
		if (user==null) {
			m.addAttribute("msg", "You must login to view the profile page!");
			view = "index";
		}
		m.addAttribute("user", user);
		return view;
	}
	
	@GetMapping("/logout")
	public String logout(Model m, HttpSession ses) {
		User user = (User) ses.getAttribute("user");
		if (user==null) return "redirect:/";
		
		service.updateLoginStatus(user);
		m.addAttribute("msg", user.getUserName() +" has logged out!");
		ses.removeAttribute("user");
		return "index";
	}
	
}
