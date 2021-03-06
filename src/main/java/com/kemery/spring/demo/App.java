package com.kemery.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
//		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/kemery/spring/demo/beans/beans.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kemery/spring/demo/beans/beans.xml");
	
		AdventuringParty party = (AdventuringParty)context.getBean("adventuringparty");
		
		System.out.println(party);
		
		Person person1 = (Person)context.getBean("person");
	//	Person person = new Person();
	//	person.speak();
		
		Person person2 = (Person)context.getBean("person");
	//	person.speak();
		
		Address address = (Address)context.getBean("address");
		
		person1.setTaxId(777);
		
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(address);
		
		Address address2 = (Address) context.getBean("address2");
		System.out.println(address2);
		
		Jungle jungle = (Jungle)context.getBean("jungle");
		
		System.out.println(jungle);
		
		((ClassPathXmlApplicationContext)context).close();

	}

}
