package day3;

public class Car extends Machine{

	
	public Car() {
		
		//To call parent constructor explicitly
		super(1000);
		
		engineSize = 3500;
		System.out.println("I am a constructor of car class");
	}
	
	public void restart(){
		System.out.println("restart method from Car class");
		
	}
	
	@Override
	public void stop(){
		System.out.println("I am a stop method from car class");
	}
	
	public void shutDown(){
		System.out.println("shut down method from Car class");
	}

}
