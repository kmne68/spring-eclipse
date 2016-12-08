package com.kemery.spring.demo;

import javax.inject.Inject;

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
	
	
	@Autowired
	public void setId(@Value("#{randomtext.getText()?.length}")String id) {
		
		this.id = id;
	}
	
	// new java.util.Date().toString()
	@Autowired
	public void setSpeech(@Value("#{T(Math).sin(T(Math).PI/4) ^ 2}")String speech) {
		
		this.speech = speech;
	}
}
 