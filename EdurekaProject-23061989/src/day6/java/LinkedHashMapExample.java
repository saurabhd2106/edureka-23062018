package day6.java;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<>();

		linkedMap.put(1000, "Saurabh");
		linkedMap.put(1001, "Swati");
		linkedMap.put(9000, "Amit");
		linkedMap.put(8000, "Saurabh");
		System.out.println(linkedMap.get(1000));
		linkedMap.put(1000, "Nishant");

		System.out.println(linkedMap.get(1000));

		for (Map.Entry<Integer, String> temp : linkedMap.entrySet()) {

			System.out.println("Empl Id :: " + temp.getKey() + " and Emp name is :: " + temp.getValue());

		}

	}

}
