package com.test.springboot;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class testFortunate implements FortunateServices {

	public testFortunate() {
		System.out.println("testFortunate......");
	}
	
	@Override
	public String doLucky() {
		// TODO Auto-generated method stub
		return "You are lucky today!";
	}
	
	@PostConstruct
	public void initMethod() {
		System.out.println("testFortunate initMethod......");
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("testFortunate destroyMethod......");
	}

}
