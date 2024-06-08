package com.railway.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping({"/","/user"})
	public String getHome() {
		return "userHome";
	}
	
	@GetMapping("/admin")
	public String getAdmin() {
		return "adminHome";
	}
}
