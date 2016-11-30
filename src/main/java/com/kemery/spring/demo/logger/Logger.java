package com.kemery.spring.demo.logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import javax.annotation.Resource;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Logger {

	
	private ConsoleWriter consoleWriter;
	private LogWriter fileWriter;
	
	
	/*
	public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter) {
		
		this.consoleWriter = consoleWriter;
		this.fileWriter = fileWriter;
	}
	*/
	
	@Resource(name="consoleWriterDemo")
	public void setConsoleWriter (ConsoleWriter writer) {
		
		this.consoleWriter = writer;
	}
	
	@Resource
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
	
	
	@PostConstruct
	public void init() {
		System.out.println("init");
	}
	
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy");
	}
	
	
}
