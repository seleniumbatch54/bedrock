package constructor_demo;

public class AFour extends AThree{

	public static void main(String[] args) {
		
		AFour a = new AFour();
		a.test();
		
	}
	
	void test() {
		
		sample();
		super.sample();
		
	}
	
	
	void sample() {
		System.out.println("Hello");
		
		
	}
	
	
	
	

}
