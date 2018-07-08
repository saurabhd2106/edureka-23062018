package day6.java;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetsExample {

	public static void main(String[] args) {
	
		LinkedHashSet<String> linkedSet = new LinkedHashSet<>();
		
		linkedSet.add("Saurabh");
		linkedSet.add("Levi");
		linkedSet.add("Swati");
		linkedSet.add("Amit");
		linkedSet.add("Madira");
		linkedSet.add("Swati");
		
		linkedSet.toArray();

		
		for(String temp: linkedSet){
			System.out.println(temp);
		}

	}

}
