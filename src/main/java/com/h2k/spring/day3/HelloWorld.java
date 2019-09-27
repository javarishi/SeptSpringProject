package com.h2k.spring.day3;

public class HelloWorld {
	
	public HelloWorld() {
		System.out.println("HelloWorld");
	}
	
	private String message;

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
