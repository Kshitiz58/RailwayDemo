package com.railway.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.railway.app.model.Subscriber;

public interface SubscriberRepository extends JpaRepository<Subscriber, Integer>{

}
