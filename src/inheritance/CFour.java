package inheritance;

public class CFour extends CTwo{

	public static void main(String[] args) {
		
		CFour c = new CFour();
		c.truck();
		c.bike();
		
		COne c1 = new COne();
		c1.car();
		
	}
	
	
	void truck() {
		System.out.println("Truck of CFour");
	}

}
