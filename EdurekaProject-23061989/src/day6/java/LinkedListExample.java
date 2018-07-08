package day6.java;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();

		linkedList.add(12);
		linkedList.add(16);
		linkedList.add(11);
		linkedList.add(14);
		linkedList.add(12);
		linkedList.add(10);
		linkedList.add(3, 78);
		linkedList.add(12);
		linkedList.add(16);
		linkedList.add(11);
		linkedList.add(14);
		linkedList.add(12);
		linkedList.add(10);
		System.out.println("------------------------------");
		System.out.println(linkedList.size());

		System.out.println("------------------------------");
		System.out.println(linkedList.get(10));

		System.out.println("------------------------------");
		for (Integer temp : linkedList) {
			System.out.println(temp);
		}

	}

}
