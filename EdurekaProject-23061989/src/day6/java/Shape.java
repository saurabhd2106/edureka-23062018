package day6.java;

public abstract class Shape {
	
	public double calculateVolume(int side, int height){
		
		double volume;
		
		volume = calculateArea(side) * height;
		
		return volume;
	}

	public abstract double calculateArea(int side);
	
	

}
