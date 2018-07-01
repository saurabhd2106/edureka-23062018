package day4;

public class DemoFirefoxDriver {

	public static void main(String[] args) {
		
		WorkingWithFirefox wf = new WorkingWithFirefox();
		
		wf.invokeBrowser();
		
		System.out.println(wf.getTitleOfThePage());
		
		wf.closeBrowser();

	}

}
