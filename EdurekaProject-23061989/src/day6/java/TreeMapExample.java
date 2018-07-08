package day6.java;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {

		TreeMap<Integer, String> treeMap = new TreeMap<>();

		
		treeMap.put(1000, "Saurabh");
		treeMap.put(1001, "Swati");
		treeMap.put(9000, "Amit");
		treeMap.put(8000, "Saurabh");
		System.out.println(treeMap.get(1000));
		treeMap.put(1000, "Nishant");

		System.out.println(treeMap.get(1000));

		for (Map.Entry<Integer, String> temp : treeMap.entrySet()) {

			System.out.println("Empl Id :: " + temp.getKey() + " and Emp name is :: " + temp.getValue());

		}

	}

}
