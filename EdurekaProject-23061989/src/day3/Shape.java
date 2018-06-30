package day3;

public class Shape {
	
	//Area for square
	double calculateArea(int len){
		return len * len;
	}
	
	//Area for circle
	double calculateArea(double rad){
		return Math.PI * rad * rad;
	}
	
	//Area for rectangle
	double calculateArea(int len, int wid){
		return len * wid;
	}

}
