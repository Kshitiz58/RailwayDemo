package com.railway.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.railway.app.model.demo;
import com.railway.app.repository.demorepository;
import com.railway.app.service.demoservice;

@Service
public class demoserviceimpl implements demoservice{

	@Autowired
	private demorepository demoRepo;
	
	@Override
	public demo userLogin(String un, String psw) {
		return demoRepo.findByUsernameAndPassword(un, psw);
	}

	@Override
	public void userSignup(demo user) {
		demoRepo.save(user);
		
	}

}
