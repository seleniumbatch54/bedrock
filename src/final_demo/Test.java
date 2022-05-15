package final_demo;

public class Test {

	
	final int x = 10;
	
	final static int y = 20;
	
	final int CINEMA_TICKET_PRICE = 60;
	
	public static void main(String[] args) {
		
		final int z = 100;
		
		Test t = new Test();
		//t.x = 100;
		
		//System.out.println(t.x);
		
		t.demo(5, 2);
		
		//t.CINEMA_TICKET_PRICE = 120;
	}
	
	
	void demo(final int x, final int y) {
		
		
		int c = x + y;
		
		System.out.println(c);
		
		//x = 10;
		
		//y = 20;
		
		c = x + y;
		
		System.out.println(c);
	}
	
	

}
