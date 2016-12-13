package com.kemery.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {

	private String id = "Default robot";
	private String speech = "hello";
	
	public void speak() {
		
		System.out.println(id + ": " + speech);
	}
	
	
	public void setId(String id) {
		
		this.id = id;
	}
	
	// new java.util.Date().toString()
	@Autowired
	public void setSpeech(@Value("${jdbc.password}")String speech) {
		
		this.speech = speech;
	}
}
 