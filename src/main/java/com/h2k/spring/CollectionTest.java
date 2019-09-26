package com.h2k.spring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Properties;

public class CollectionTest {

	private Properties adminEmails;
	private ArrayList<String> someList;
	private HashSet<String> sampleSet;
	private HashMap<String, String> someMap;

	/**
	 * @return the adminEmails
	 */
	public Properties getAdminEmails() {
		return adminEmails;
	}

	/**
	 * @param adminEmails the adminEmails to set
	 */
	public void setAdminEmails(Properties adminEmails) {
		this.adminEmails = adminEmails;
	}

	/**
	 * @return the someList
	 */
	public ArrayList<String> getSomeList() {
		return someList;
	}

	/**
	 * @param someList the someList to set
	 */
	public void setSomeList(ArrayList<String> someList) {
		this.someList = someList;
	}

	/**
	 * @return the sampleSet
	 */
	public HashSet<String> getSampleSet() {
		return sampleSet;
	}

	/**
	 * @param sampleSet the sampleSet to set
	 */
	public void setSampleSet(HashSet<String> sampleSet) {
		this.sampleSet = sampleSet;
	}

	/**
	 * @return the someMap
	 */
	public HashMap<String, String> getSomeMap() {
		return someMap;
	}

	/**
	 * @param someMap the someMap to set
	 */
	public void setSomeMap(HashMap<String, String> someMap) {
		this.someMap = someMap;
	}
	
}
