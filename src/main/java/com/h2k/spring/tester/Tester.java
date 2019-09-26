package com.h2k.spring.tester;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.h2k.spring.MSWord;

public class Tester {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring.xml"}) ;
		
	//	Customer fromContext = context.getBean("customer", Customer.class);
	//	System.out.println(fromContext.getFirstName());
	//	System.out.println(fromContext.getLastName());
	//	System.out.println(fromContext.getLanguage());
		
		// You dont need beanName if only one bean is present in Spring XML
		MSWord wordFile = context.getBean(MSWord.class);
		System.out.println(wordFile.getDocLanguage());
		System.out.println(wordFile.getDocTitle());
		System.out.println(wordFile.getSpellChecker().getLanguage());
		// shut down your context
		context.close();

	}

}
