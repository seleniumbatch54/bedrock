package constructor_demo1;

public class CTwo {

	int x = 10;
	
	public static void main(String[] args) {

		CTwo c1 = new CTwo();
	//	CTwo c2 = new CTwo(2);
		//CTwo c3 = new CTwo(2, 6);
	}

	CTwo(){
		this(2);
		
		System.out.println("Hi");
		
	}

	CTwo(int x){
		this(5,9);
		System.out.println("Hello");
	}

	CTwo(int y, int z){
	
		System.out.println("Bye");
	}

	void demo() {
		
		int x = 100;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println("Hi");
	}

	void demo(int x) {
		System.out.println("Hi");
	}

	void demo(int x, int y) {
		System.out.println("Hi");
	}

}
