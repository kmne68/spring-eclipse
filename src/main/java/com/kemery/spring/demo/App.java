package com.kemery.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
//		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/kemery/spring/demo/beans/beans.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kemery/spring/demo/beans/beans.xml");
	
		
		Person person = (Person)context.getBean("person");
	//	Person person = new Person();
		person.speak();
		
		((ClassPathXmlApplicationContext)context).close();

	}

}
