package com.h2k.spring.day3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class CachingMovieLister {
	
	public CachingMovieLister() {
		System.out.println("CachingMovieLister Constructor");
	}

	@PostConstruct
	public void populateMovieCache() { 
		System.out.println("populates the movie cache upon initialization..."); 
		} 
	
	@PreDestroy
	public void clearMovieCache() { 
		System.out.println("clears the movie cache upon destruction..."); 
		}
	}

