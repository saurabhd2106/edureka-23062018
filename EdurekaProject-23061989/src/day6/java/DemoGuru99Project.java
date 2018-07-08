package day6.java;

public class DemoGuru99Project {

	public static void main(String[] args) {
		
		Guru99Project guru = new Guru99Project();
		
		try {
			guru.invokeBrowser();
			
			guru.login();
			
			guru.addCustomer();
			
			guru.logout();
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
		guru.closeBrowser();
		}
		guru.closeBrowser();
		

	}

}
