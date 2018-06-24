package day2;

public class GreatestOutOfThreeNumbers {

	public static void main(String[] args) {
		int firstNum, secNum, thirdNum;

		firstNum = 101;
		secNum = 99;
		thirdNum = 199;

		if (firstNum > secNum && firstNum > thirdNum) {
			System.out.println("First Number is greatest");
		} else if (secNum > firstNum && secNum > thirdNum) {
			System.out.println("Second Number is greatest");
		} else if (thirdNum > firstNum && thirdNum > secNum) {
			System.out.println("Third Number is greatest");
		} else if (firstNum == secNum && firstNum > thirdNum) {
			System.out.println("Both first and second Number are greater than third");
		} else if (firstNum == thirdNum && firstNum > secNum) {
			System.out.println("Both first and third Number are greater than second");
		} else if (thirdNum == secNum && thirdNum > firstNum) {
			System.out.println("Both third and second Number are greater than first");
		} else {
			System.out.println("All three are equal");
		}

	}

}
