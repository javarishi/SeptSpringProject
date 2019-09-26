package com.h2k.spring;

import org.springframework.beans.factory.annotation.Required;

public class Store {
	
	private int storeNumber;
	private int zipCode;

	private String storeName;
	
	public Store(int storeNumber, int zipCode) {
		this.storeNumber = storeNumber;
		this.zipCode = zipCode;
		System.out.println("Store Number :: " + storeNumber + "  Zip Code :: " + zipCode);
	}

	/**
	 * @return the storeName
	 */
	@Required
	public String getStoreName() {
		return storeName;
	}

	/**
	 * @param storeName the storeName to set
	 */
	@Required
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

}
