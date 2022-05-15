package encapsulation;

public class VariableDemo {

	byte a;
	
	short b;
	
	int c;
	
	long d;
	
	float e;
	
	double f;
	
	char g;
	
	boolean h;
	
	
	//static int y;
	
	public static void main(String[] args) {
	
		int z = 30;
		
		int i ;
		
		
		VariableDemo vd = new VariableDemo();
		vd.demo();
		i = 10;
		System.out.println(i);
		//System.out.println(vd.x);
		
		//System.out.println(y);
		
		//System.out.println(z);

	}
	
	
	void demo() {
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
	}

}
