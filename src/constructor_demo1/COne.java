package constructor_demo1;

public class COne {

	int x ;

	public static void main(String[] args) {


		COne c = new COne(5);
		c.demo();

	}

	COne(int x){
		this.x = x;
		
		
	}

	void demo() {
		System.out.println("Hi");
	}

	static void sample() {
		System.out.println("Bye");
	}

}
