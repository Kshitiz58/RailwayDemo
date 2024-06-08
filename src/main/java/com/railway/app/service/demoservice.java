package com.railway.app.service;

import com.railway.app.model.demo;

public interface demoservice {

	demo userLogin(String un, String psw);

	void userSignup(demo user);
}
