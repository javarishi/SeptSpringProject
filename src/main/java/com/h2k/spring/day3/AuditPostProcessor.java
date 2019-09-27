package com.h2k.spring.day3;

import java.util.Calendar;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class AuditPostProcessor implements BeanPostProcessor {
	

	public Object postProcessBeforeInitialization(Object bean, String beanName) 
			throws BeansException {
		System.out.println("Audit Message BeforeInitialization : Bean Class Name : " 
								+ bean.getClass().getName() 
								+ " Bean Name in XML :: " + beanName 
								+ " Time :: " + Calendar.getInstance().getTime());	
		return bean;
	}
	
	
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Audit Message AfterInitialization : Bean Class Name : " 
				+ bean.getClass().getName() 
				+ " Bean Name in XML :: " + beanName 
				+ " Time :: " + Calendar.getInstance().getTime());
		return bean;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
