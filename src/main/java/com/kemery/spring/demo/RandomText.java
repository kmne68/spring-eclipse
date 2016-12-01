package com.kemery.spring.demo;

import java.util.Random;

public class RandomText {
	
	private static String[] texts = {
			"I'll be back",
			"Danger Will Robinson!",
			"I am fluent in over six million forms of communication."
	};

	
	public String getText() {
		
		Random random = new Random();
		
		return texts[random.nextInt(texts.length)];
	}
}
