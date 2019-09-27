package com.h2k.spring.day3;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;

public class Account implements InitializingBean, DisposableBean{

	private String custName;
	private String accountNumber;
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("Account ::afterPropertiesSet " );
		
	}

	/**
	 * @return the custName
	 */
	public String getCustName() {
		return custName;
	}

	/**
	 * @param custName the custName to set
	 */
	public void setCustName(String custName) {
		System.out.println("Setting customer name :: " + custName);
		this.custName = custName;
	}

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	@Required
	public void setAccountNumber(String accountNumber) {
		System.out.println("Setting accountNumber :: " + accountNumber);
		this.accountNumber = accountNumber;
	}

	/**
	 * destroy method
	 */
	public void destroy() throws Exception {
		System.out.println("Account : destroy ");
		
	}

}
