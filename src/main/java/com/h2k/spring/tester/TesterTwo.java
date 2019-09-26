package com.h2k.spring.tester;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.h2k.spring.CollectionTest;
import com.h2k.spring.Customer;
import com.h2k.spring.Store;

public class TesterTwo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"day2.xml"}) ;
		
	//	Customer customer = context.getBean("custFactoryInstance", Customer.class);
	//	Store store = context.getBean("store", Store.class);
	//	Customer customer = context.getBean("pCust", Customer.class);
	//	System.out.println(customer.getFirstName());
		CollectionTest test = context.getBean("collect", CollectionTest.class);
		System.out.println(test.getAdminEmails());
		System.out.println(test.getSomeList());
		System.out.println(test.getSampleSet());
		System.out.println(test.getSomeMap());
		context.close();
	}

}
