package com.kemery.spring.demo.logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Logger {

	
	private ConsoleWriter consoleWriter;
	private LogWriter fileWriter;
	
	
	/*
	public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter) {
		
		this.consoleWriter = consoleWriter;
		this.fileWriter = fileWriter;
	}
	*/
	
	@Autowired
	@Qualifier("toconsole")
	public void setConsoleWriter (ConsoleWriter writer) {
		
		this.consoleWriter = writer;
	}
	
	@Autowired
	@Qualifier("filewriter")
	public void setFileWriter(LogWriter fileWriter) {
		
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
