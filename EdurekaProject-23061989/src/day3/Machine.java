package day3;

public class Machine {
	
	int engineSize;
	
	public Machine() {
		engineSize = 2400;
		System.out.println("I am a constructor of machine");
	}
	
	public Machine(int engineSize){
		
		System.out.println("I am a paramterized cconstructor");
		this.engineSize = engineSize;
	}
	
	public void start(){
		System.out.println("I am a start method of Machine");
	}
	
	public void stop(){
		System.out.println("I am a stop method of Machine");
	}

}
