package com.railway.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.railway.app.model.Subscriber;
import com.railway.app.repository.SubscriberRepository;
import com.railway.app.service.SubscriberService;


@Service
public class SubcriberServiceImpl implements SubscriberService{

	@Autowired
	private SubscriberRepository subRepo;
	
	@Override
	public void SubscriberEmail(Subscriber subscriber) {
		subRepo.save(subscriber);
		
	}

}
