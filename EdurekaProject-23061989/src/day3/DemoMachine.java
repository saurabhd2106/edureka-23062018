package day3;

public class DemoMachine {

	public static void main(String[] args) {
		
		Machine mac = new Machine();
		
		//mac.start();
		
		mac.stop();
		
		//-------------------------------------------------
		System.out.println("-----------------------------------------");
		Car bmw = new Car();
		
	/*	bmw.restart();
		
		bmw.start();*/
		
		bmw.stop();
		
		System.out.println("-------------------------------------------");
		
		Machine alto;
		alto = new Car();
		
		alto.stop();
		
		System.out.println(alto.engineSize);

		System.out.println("-------------------------------------------");
		
		
	}

}
