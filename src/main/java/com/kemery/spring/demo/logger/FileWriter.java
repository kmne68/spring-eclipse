package com.kemery.spring.demo.logger;

public class FileWriter implements LogWriter {

	public void write(String text) {
		
		System.out.println("Write to fiel: " + text);
	}
}
