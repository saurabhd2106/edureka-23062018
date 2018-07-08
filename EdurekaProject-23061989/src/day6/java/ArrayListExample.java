package day6.java;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();

		arrayList.add(12);
		arrayList.add(16);
		arrayList.add(11);
		arrayList.add(14);
		arrayList.add(12);
		arrayList.add(10);
		arrayList.add(3, 78);
		arrayList.add(12);
		arrayList.add(16);
		arrayList.add(11);
		arrayList.add(14);
		arrayList.add(12);
		arrayList.add(10);
		System.out.println("------------------------------");
		System.out.println(arrayList.size());

		System.out.println("------------------------------");
		System.out.println(arrayList.get(10));

		System.out.println("------------------------------");
		for (Integer temp : arrayList) {
			System.out.println(temp);
		}

	}

}
