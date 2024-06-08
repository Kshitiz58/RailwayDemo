package com.railway.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping({"/","/demo","deploy"})
	public String getDeploy() {
		return "Spring App is Successfully Deployed in Railway.app!!";
	}
}
