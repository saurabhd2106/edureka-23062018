package day2;

public class DemoEmployee {

	public static void main(String[] args) {

		// Declaring an object
		Employee saurabh;

		// Instantiation and Initialization
		saurabh = new Employee();

		saurabh.salary = 80000;
		saurabh.bonus = 5000;

		int saurabhSalary = saurabh.calculateSalary2();
		
		System.out.println("Saurabh's salary :: "+saurabhSalary);
		
		//-----------------------------------------------------
		
		Employee siva = new Employee();
		siva.salary = 50000;
		siva.bonus = 4000;
		
		int sivaSalary = siva.calculateSalary4(30000, 5000);
		
		
		
		System.out.println("Salary of Siva is ::"+ sivaSalary);
	}

}
