package day6.java;

import java.util.HashSet;

public class SetsExample {

	public static void main(String[] args) {
	
		HashSet<String> hashset = new HashSet<>();
		
		hashset.add("Saurabh");
		hashset.add("Levi");
		hashset.add("Swati");
		hashset.add("Amit");
		hashset.add("Madira");
		hashset.add("Swati");
		
		for(String temp: hashset){
			System.out.println(temp);
		}

	}

}
