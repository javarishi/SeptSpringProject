package com.h2k.spring;

public class CustomerFactory {

	private CustomerFactory() {
		System.out.println("No one should instantiate ");
	}
	
	public Customer getInstance() {
		Customer cust = new Customer("Atlanta");
		return cust;
	}
}
