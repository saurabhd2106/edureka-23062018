package day7;

public class DemoEbayProject {

	public static void main(String[] args) {
		EbayProject ebay = new EbayProject();

		ebay.invokeBrowser("chrome");

		ebay.getLinkCount();

		/*
		 * ebay.getUrlFromALink();
		 * 
		 * ebay.getAllLinks();
		 */

		String result = ebay.searchProduct("Apple watches", "Watches");

		System.out.println("Result count :: " + result);

		ebay.getNthProduct(10);

		// ebay.getAllProducts();
		// ebay.getAllProductsWithScrollDown();
		ebay.getAllProductsViaJS();
	}

}
