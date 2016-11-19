package com.kemery.spring.demo.logger;

public class ConsoleWriter implements LogWriter{

	public void write(String text) {
		
		System.out.println(text);
	}
	
}
