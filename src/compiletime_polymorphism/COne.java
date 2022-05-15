package compiletime_polymorphism;

public class COne {

	public static void main(String[] args) {
		
		COne c = new COne();
		c.add(2.5, 4);
		
	}
	
	
	void add() {
		int x = 10;
		int y = 20;
		
		System.out.println(x+y);
	}
	
	void add(int x) {
		 x = 10;
		int y = 20;
		
		System.out.println(x+y);
	}
	
	void add(int x, int y) {
			
		System.out.println(x+y);
	}
	
	void add(int x, double y) {
		
		System.out.println(x+y);
	}
	
	void add(double x, int y) {
		
		
		System.out.println(x+y);
	}

}
