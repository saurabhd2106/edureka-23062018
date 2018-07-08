package day6.java;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
	
		TreeSet<String> treeSet = new TreeSet<>(Collections.reverseOrder());
		
		treeSet.add("Saurabh");
		treeSet.add("Levi");
		treeSet.add("Swati");
		treeSet.add("Amit");
		treeSet.add("Madira");
		treeSet.add("Swati");
		
		treeSet.toArray();

		
		for(String temp: treeSet){
			System.out.println(temp);
		}

	}

}
