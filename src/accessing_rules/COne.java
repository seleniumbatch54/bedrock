package accessing_rules;

public class COne {

	
	public static void main(String[] args) {
		s1();
		COne c = new COne();
		c.n2();
	}
	
	void n1() {
		System.out.println("n1 non-static method");
		n2();
		s1();
	}
	
	void n2() {
		System.out.println("n2 non-static method");
	}
	
	static void s1() {
		System.out.println("s1 static method");
		COne c = new COne();
		c.n2();
		
	}
	
	static void s2() {
		System.out.println("s2 static method");
	}

}
