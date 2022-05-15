package encapsulation;

public class Type3 {

	public static void main(String[] args) {
		
		Type3 t = new Type3();
		int result = t.add();
		
	}
	
	int add() {
		
		int x = 10;
		
		int y = 20;
		
		int z = x + y;
		
		return z;
	}

}
