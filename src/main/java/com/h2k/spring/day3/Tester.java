package com.h2k.spring.day3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext 
			= new ClassPathXmlApplicationContext(new String[] {"day3.xml"});
		
		Account account = appContext.getBean("account", Account.class);
		System.out.println(account.getCustName() +  "  " + account.getAccountNumber());
		
		
		HelloUS hello = appContext.getBean("helloUS", HelloUS.class);
		System.out.println(hello.getMessage());
		System.out.println(hello.getMessage2());
		// closing thread to call destory method
		
		CachingMovieLister cache = appContext.getBean("cachingMovieLister" , CachingMovieLister.class);
		
		appContext.registerShutdownHook();
		appContext.close();
	}

}
