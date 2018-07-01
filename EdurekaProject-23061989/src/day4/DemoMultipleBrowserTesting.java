package day4;

public class DemoMultipleBrowserTesting {

	public static void main(String[] args) {
		MultipleBrowserTesting mt = new MultipleBrowserTesting();
		
		mt.invokeBrowser("firefox");
		
		System.out.println(mt.getTitleOfThePage());
		
		mt.closeBrowser();

	}

}
