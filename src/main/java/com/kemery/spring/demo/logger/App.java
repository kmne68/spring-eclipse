package com.kemery.spring.demo.logger;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kemery.spring.demo.Robot;
import com.kemery.spring.demo.model.Offer;
import com.kemery.spring.demo.model.OffersDAO;

public class App {

	public static void main(String[] args) {
			
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kemery/spring/demo/logger/new_beans.xml");
		
		// 		ApplicationContext context = new ClassPathXmlApplicationContext("com/kemery/spring/demo/beans/beans.xml");
		
		// Logger logger = (Logger)context.getBean("logger");
		
		// Robot robot = (Robot)context.getBean("robot");
		
		OffersDAO offersDao = (OffersDAO)context.getBean("offersDao");
		
		List<Offer> offers = offersDao.getOffers();
		
		for(Offer offer: offers) {
			System.out.println(offer);
		}
		
		//logger.writeConsole("Hello there");
		//logger.writeFile("Hi again");
		
		// robot.speak();
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
