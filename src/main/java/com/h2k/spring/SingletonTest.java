package com.h2k.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Customer customerOne = context.getBean("customer", Customer.class);
		System.out.println("customerOne :: "  +customerOne.getFirstName());
	
		Customer customertwo = context.getBean("customer", Customer.class);
		System.out.println("customertwo :: "  +customertwo.getFirstName());
		
		if(customerOne.equals(customertwo)) {
			System.out.println("Both Objects are Equal");
		}
		// Set Lang = Spanish in customerOne
		customerOne.setLanguage("Spanish");
		System.out.println("customerOne :: "  + customerOne.getLanguage());
		System.out.println("customertwo :: "  + customertwo.getLanguage());
		// this is Singleton way of object creation 
		
		context.close();

	}

}
