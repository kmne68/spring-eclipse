package com.kemery.spring.demo;

import java.util.List;

public class AdventuringParty {

	private String name;
	private List<String> members;
	
	public AdventuringParty(String name, List<String> members) {
		
		this.name = name;
		this.members = members;
	}
	
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(name);
		sb.append(" contains:\n");
		
		for(String member: members) {
			sb.append(member);
			sb.append("\n");
		}
		
		return sb.toString();
	}
}
