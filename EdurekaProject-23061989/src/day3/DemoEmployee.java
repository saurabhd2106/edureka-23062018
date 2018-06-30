package day3;

public class DemoEmployee {

	public static void main(String[] args) {
		Employee saurabh = new Employee();

		int salary = saurabh.calculateSalary();

		System.out.println("Salary :: "+ salary);
		
		//-------------------------------------------------
		
		Employee vikas = new Employee(30000, 5000);
		
		vikas.setSalary(-90000);
		
		System.out.println(vikas.getSalary());
		vikas.setBonus(-5000);
		
		System.out.println(vikas.calculateSalary());
	}

}
