package constructor_demo;

public class ATwo extends AOne{

	int x = 1000;
	public static void main(String[] args) {
		
		ATwo a = new ATwo();
		//a.test();
		a.demo();

	}
	
	void test() {
		
		int x = 10000;
		
		System.out.println(x);
		System.out.println(this.x);
		
		/*
		AOne a = new AOne();
		System.out.println(a.x);
		*/
		
		System.out.println(super.x);
	}
	
	void demo() {
		//int x = 10000;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}

}
