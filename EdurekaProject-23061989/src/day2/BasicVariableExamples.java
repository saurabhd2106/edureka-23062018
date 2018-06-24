package day2;

public class BasicVariableExamples {
	public static void main(String[] args) {
		
		int firstNumber;
		
		firstNumber = 50;
		
		long secondNumber = 100;
		
		System.out.println("First Number :: "+ firstNumber);
		System.out.println("Second Number :: "+ secondNumber);
		
		String myStr = "Saurabh";
		System.out.println(myStr + (firstNumber + secondNumber));
		 
		byte firstValue = 84;
		short myShortNum = 343;
		
		char myChar = '6';
		
		boolean status = 16>7;
		
		System.out.println(status);
		
		System.out.println(myShortNum % 100);
		
		System.out.println(firstNumber++);
		
		System.out.println(++firstNumber);
	}
}
