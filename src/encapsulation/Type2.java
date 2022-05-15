package encapsulation;

public class Type2 {

	public static void main(String[] args) {
		
		Type2 t = new Type2();
		t.add(2, 3);
		t.add(4, 5);
		t.add(6, 7);
		t.add(8, 9);

	}
	
	void add(int x, int y) {
		
		System.out.println(x+y);
	}

}
