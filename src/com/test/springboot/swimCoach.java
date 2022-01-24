package com.test.springboot;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class swimCoach implements Coach{
	@Autowired
	FortunateServices fs;
		
	public swimCoach() {
		System.out.println("swimCoach Constructor");
	}
	
	@Override
	public String doWorkOut() {
		return "Swim 100m";
	}
	
	public String doLucky() {
		return fs.doLucky();
	}
	
	@PostConstruct
	public void initMethod() {
		System.out.println("swimCoach initMethod......");
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("swimCoach destroyMethod......");
	}
	
}
