package day6.java;

public class ExceptionalHandling {

	public static void main(String[] args) {
		int[] arr = new int[5];

		try {
			arr[0] = 10;
			arr[1] = 11;
			arr[2] = 12;
			arr[3] = 14;
			arr[4] = 16;

			for (int i = 0; i < 5; i++) {
				System.out.println(arr[i]);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();

		} catch (RuntimeException e) {
			System.out.println("An exception occured");
		} catch (Exception e) {
			System.out.println("An exception occured");
		} finally {
			System.out.println("I always execute...");
		}
		System.out.println("I am code after for loop");
	}

}
