package access_specifiers1;

public class COne {

	private static int x = 10;

	static int y = 20;

	protected static int z = 30;

	public static int a = 40;

	public static void main(String[] args) {

		System.out.println(x);

		System.out.println(y);

		System.out.println(z);
		
		System.out.println(a);



	}

	private static void test() {
		System.out.println("Test method of COne class");
	}

}
