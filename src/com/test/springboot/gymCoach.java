package com.test.springboot;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class gymCoach implements Coach{
	@Autowired
	FortunateServices fs;
		
	public gymCoach() {
		System.out.println("gymCoach Constructor");
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
		System.out.println("gymCoach initMethod......");
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("gymCoach destroyMethod......");
	}
	
}
