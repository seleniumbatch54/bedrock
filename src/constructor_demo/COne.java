package constructor_demo;

public class COne {

	
	int x;
	
	public static void main(String[] args) {
		
		COne c = new COne();
		c.demo();
	}
	
	void demo() {
		System.out.println("Hi");
	}
	
	
	COne(){
		x = 10;
		System.out.println(x);
	}

}
