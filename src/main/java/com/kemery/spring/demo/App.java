package com.kemery.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		
		System.out.println("If you see this, it worked.");
		
		Person person = (Person)context.getBean("person");
	//	Person person = new Person();
		person.speak();

	}

}
