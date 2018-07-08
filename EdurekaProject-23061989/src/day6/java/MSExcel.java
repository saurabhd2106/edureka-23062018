package day6.java;

public class MSExcel implements MSOffice, MSProduct {

	@Override
	public void add() {
		System.out.println("Add in MS Excel");
		
	}

	@Override
	public void save() {
		System.out.println("Save in MS Excel");
		
	}

	@Override
	public void saveAs() {
		System.out.println("Save as in MS Excel");
		
	}
	
	public void restart(){
		System.out.println("Restart");
	}

	@Override
	public void newFile() {
		// TODO Auto-generated method stub
		
	}

}
