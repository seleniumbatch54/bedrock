package encapsulation;

public class Type4 {

	public static void main(String[] args) {
		
		Type4 t = new Type4();
		int r1 = t.add(2, 4);
		System.out.println(r1);
		
		int r2 = t.add(6, 8);
		System.out.println(r2);
		
		int r3 = t.add(10, 12);
		System.out.println(r3);

	}
	
	int add(int x, int y) {
		
		int z = x + y;
		
		return z;
		
	}

}
