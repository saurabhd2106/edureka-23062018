package day4;

public class DemoEdgeBrowser {

	public static void main(String[] args) {
		
		WorkingWithEdge we = new WorkingWithEdge();
		
		we.invokeBrowser();
		
		System.out.println(we.getTitleOfThePage());
		
		we.closeBrowser();

	}

}
