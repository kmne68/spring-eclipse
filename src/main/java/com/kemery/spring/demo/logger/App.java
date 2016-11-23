package com.kemery.spring.demo.logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
			
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kemery/spring/demo/logger/new_beans.xml");
		
		// 		ApplicationContext context = new ClassPathXmlApplicationContext("com/kemery/spring/demo/beans/beans.xml");
		
		Logger logger = (Logger)context.getBean("logger");
		
		logger.writeConsole("Hello there");
		logger.writeFile("Hi again");
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
