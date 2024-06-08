package com.railway.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.railway.app.model.Subscriber;
import com.railway.app.model.demo;
import com.railway.app.service.SubscriberService;
import com.railway.app.service.demoservice;

@Controller
public class DemoController {

	@Autowired
	private demoservice userService;
	
	@Autowired
	private SubscriberService subService;
	
	@GetMapping("/")
	public String getIndex() {
		return "index";
	}
	
	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}
	
	@GetMapping("/signup")
	public String getSignup() {
		return "signup";
	}
	
	@PostMapping("/signup")
	public String postSignup(@ModelAttribute demo user) {
		user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
		userService.userSignup(user);
		return "redirect:/login";
	}
	
	@PostMapping("/login")
	public String doLogin(@ModelAttribute demo user, Model model) {
			userService.userLogin(user.getUsername(), user.getPassword());
			model.addAttribute("uname", user.getUsername());
		return "redirect:/home";
	}
	
	@GetMapping("/home")
	public String getHome() {
		return "Home";
	}
	
	@GetMapping("/logout")
	public String getLogout() {
		return "redirect:/";
	}
	@PostMapping("/")
	public String getSubsriber(Subscriber subsriber) {
		subService.SubscriberEmail(subsriber);
		return "redirect:/";
	}
}
