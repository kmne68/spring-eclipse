package com.kemery.spring.demo.logger;

import org.springframework.beans.factory.annotation.Autowired;

public class Logger {

	//@Autowired
	private ConsoleWriter consoleWriter;
	private FileWriter fileWriter;
	
	
	/*
	public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter) {
		
		this.consoleWriter = consoleWriter;
		this.fileWriter = fileWriter;
	}
	*/
	
	
	public void setConsoleWriter (ConsoleWriter writer) {
		
		this.consoleWriter = writer;
	}
	
	@Autowired (required = false)
	public void setFileWriter(FileWriter fileWriter) {
		
		this.fileWriter = fileWriter;
	}
	
	
	public void writeFile(String text) {
		
		fileWriter.write(text);
	}
	
	
	public void writeConsole(String text) {
		if(consoleWriter != null) {
			consoleWriter.write(text);
		}
	}
}
