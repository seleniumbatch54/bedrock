package constructor_demo;

public class AOne {

	int x = 10;
	
	static int y = 20;
	
	public static void main(String[] args) {
			
		AOne a = new AOne();
		a.demo();

	}
	
	void demo() {
		int z = 30;
		
		int x = 100;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
	}

}
