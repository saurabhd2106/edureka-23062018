package day6.java;

public class DemoShape {

	public static void main(String[] args) {
		
		Cylinder cyl = new Cylinder();
		
		Cuboid cub = new Cuboid();
		
		double vol = cyl.calculateVolume(10, 5);
		
		double vol2 = cub.calculateVolume(10, 5);

		System.out.println("Volume of cylinder :: "+ vol);
		
		System.out.println("Volume of cuboid :: "+ vol2);
	}

}
