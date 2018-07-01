package day4;

public class DemoChrome {

	public static void main(String[] args) {

		WorkingWithChrome wc = new WorkingWithChrome();

		wc.invokeBrowser();

		System.out.println(wc.getTitleOfThePage());

		wc.navigateCommands();

		System.out.println(wc.getPageCurrentUrl());

		System.out.println(wc.getTitleOfThePage());

		wc.closeBrowser();

	}

}
