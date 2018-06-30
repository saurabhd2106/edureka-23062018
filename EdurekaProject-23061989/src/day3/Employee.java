package day3;

public class Employee {

	public Employee() {
		System.out.println("I am a construtor");
		salary = 9000;
		bonus = 3000;
	}

	public Employee(int salary, int bonus) {
		this.salary = salary;
		this.bonus = bonus;
	}
	
	

	private int salary;
	private int bonus;
	
	public int getSalary() {
		return salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public void setSalary(int salary){
		if(salary <0){
			System.err.println("Invalid salary");
		} else {
			this.salary = salary;
		}
		
	}

	int calculateSalary() {
		int totalSalary = salary + bonus;

		return totalSalary;
	}

}
