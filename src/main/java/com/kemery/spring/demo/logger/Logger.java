package com.kemery.spring.demo.logger;



public class Logger {

	private LogWriter consoleWriter;
	private LogWriter fileWriter;
	
	// change parameter from ConsoleWriter 2016-11-23
	public void setConsoleWriter (LogWriter writer) {
		
		this.consoleWriter = writer;
	}
	
	// change parameter from FileWriter 2016-11-23	
	public void setFileWriter(LogWriter fileWriter) {
		
		this.fileWriter = fileWriter;
	}
	
	
	public void writeFile(String text) {
		
		fileWriter.write(text);
	}
	
	
	public void writeConsole(String text) {
		
		consoleWriter.write(text);
	}
}
