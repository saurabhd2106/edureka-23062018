package day6.java;

public class MSWord implements MSOffice{

	@Override
	public void add() {
	System.out.println("Add in MS Word");
		
	}

	@Override
	public void save() {
		System.out.println("Save in MS Word");
	}

	@Override
	public void saveAs() {
		System.out.println("Save as in MS Word");
		
	}

}
