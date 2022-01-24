package com.test.springboot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		swimCoach coach = context.getBean("swimCoach",swimCoach.class);
		
		System.out.println(coach.doWorkOut());
		
		System.out.println(coach.doLucky());
		
		context.close();
	}

}
