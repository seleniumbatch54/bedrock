package string_demo;

public class Pen {

	
	//1.  COLOR, PRICE, WEIGHT, LENGTH ETC 
	
	String color = "Blue";
	int price = 10;
	double weight = 5.5;
	
	int length = 4;
	
	
	public static void main(String[] args) {
		
		//ClassName refVar = new ClassName();
		Pen p = new Pen();
		p.write();
	}
	
	public void write() {
		
		System.out.println("To write");
	}

}
