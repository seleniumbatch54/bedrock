package accessing_rules;

public class CTwo {

	public static void main(String[] args) {
		

	}

	void n3() {
		System.out.println("n3 non-static method");
		COne.s1();
	}
	
	void n4() {
		System.out.println("n4 non-static method");
		COne c = new COne();
		c.n2();
	}
	
	static void s3() {
		System.out.println("s3 static method");
		COne c = new COne();
		c.n2();
		
	}
	
	static void s4() {
		System.out.println("s4 static method");
		COne.s2();
	}
}
