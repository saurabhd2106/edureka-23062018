package day4;

public class DemoMultipleBrowserTesting {

	public static void main(String[] args) {
		try {
			MultipleBrowserTesting mt = new MultipleBrowserTesting();
			
			mt.invokeBrowser("firefox");
			
			System.out.println(mt.getTitleOfThePage());
			
			mt.closeBrowser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
