package day6.java;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<>();

		hashMap.put(1000, "Saurabh");
		hashMap.put(1001, "Swati");
		hashMap.put(9000, "Amit");
		hashMap.put(8000, "Saurabh");
		System.out.println(hashMap.get(1000));
		hashMap.put(1000, "Nishant");

		System.out.println(hashMap.get(1000));

		for (Map.Entry<Integer, String> temp : hashMap.entrySet()) {

			System.out.println("Empl Id :: " + temp.getKey() + " and Emp name is :: " + temp.getValue());

		}

	}

}
