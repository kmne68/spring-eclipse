package com.kemery.spring.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Jungle {

	private Animal largest;
	private Animal monkeyest;
	private List<Animal> animals;
	private Map<String, String> foods = new HashMap<String, String>();
	
	
	public void setFoods(Map<String, String> foods) {
		
		this.foods = foods;
	}


	public Animal getLargest() {
		
		return largest;
	}
	
	
	public Animal getMonkyest() {
		
		return monkeyest;
	}
	
	
	public void setMonkeyest(Animal monkeyest) {
		
		this.monkeyest = monkeyest;
	}

	
	public void setLargest(Animal largest) {
		
		this.largest = largest;
	}
	
	
	public List<Animal> getAnimals() {
		
		return animals;
	}

	
	public void setAnimals(List<Animal> animals) {
		
		this.animals = animals;
	}
	
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Largest: " + largest);
		sb.append("\n");
		sb.append("Monkeyest: " + monkeyest);
		sb.append("Others:\n");
		
		for(Animal animal: animals) {
			sb.append(animal);
			sb.append("\n");
		}
		
		for(Map.Entry<String, String> entry: foods.entrySet()) {
			
			sb.append(entry.getKey() + ": " + entry.getValue() + "\n");
		}
		
		return sb.toString();
	}
} 