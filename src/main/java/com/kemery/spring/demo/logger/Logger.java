package com.kemery.spring.demo.logger;



public class Logger {

	private ConsoleWriter consoleWriter;
	private FileWriter fileWriter;
	
	
	// Remove this constructor and change autowire from "constructor" to "By Name" in the beans overview
	// to implement autowire by name
/*	public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter) {
		
		this.consoleWriter = consoleWriter;
		this.fileWriter = fileWriter;
	}
*/
	
	// change parameter from ConsoleWriter 2016-11-23
	public void setConsoleWriter (ConsoleWriter writer) {
		
		this.consoleWriter = writer;
	}
	
	// change parameter from FileWriter 2016-11-23	
	public void setFileWriter(FileWriter fileWriter) {
		
		this.fileWriter = fileWriter;
	}
	
	
	public void writeFile(String text) {
		
		fileWriter.write(text);
	}
	
	
	public void writeConsole(String text) {
		
		consoleWriter.write(text);
	}
}
