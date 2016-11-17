package com.kemery.spring.demo;

import java.util.List;

public class Jungle {

	private Animal largest;
	private Animal monkeyest;
	private List<Animal> animals;
	

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
		
		return sb.toString();
	}
}