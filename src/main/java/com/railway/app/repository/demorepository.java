package com.railway.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.railway.app.model.demo;

public interface demorepository extends JpaRepository<demo, Integer>{
	demo findByUsernameAndPassword(String un, String psw);

}
