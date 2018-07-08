package day6.java;

public class Guru99Project {
	public void invokeBrowser() {
		try {

			System.out.println("Invoke Browser Method");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void login() throws Exception{
		
			int arr[] = new int[5];
			arr[0] = 10;
			arr[1] = 11;
			arr[2] = 12;
			arr[3] = 14;
			arr[4] = 16;

			for (int i = 0; i <= 5; i++) {
				System.out.println(arr[i]);
			}

			System.out.println("Login Method");

		

	}

	public void addCustomer() {
		try {

			System.out.println("Add Customer");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void logout() {
		try {

			System.out.println("Logout");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void closeBrowser() {
		try {

			System.out.println("Close browser");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
