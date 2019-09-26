package com.h2k.spring;

public class Customer {
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String city) {
		this.city = city;
		System.out.println("Customer :: " + this.city);
	}
	
	private String firstName;
	private String lastName;
	private String language;
	private String city;
	
	// after properties are set - after construction
	public void start() {
		System.out.println("This is initialization method for Customer class.");
	}
	
	// destroy 
	public void end() {
		System.out.println("This is destruction method for Customer class.");
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

}
