package exception_handling;

public class COne {

	public static void main(String[] args) {
		
		
		System.out.println("Hi");
		
		try {
		System.out.println(2/0);
		}
		catch(ArithmeticException e) {
			
			//e.printStackTrace();
			
			//System.out.println(e.toString());
			
			//System.out.println(e.getMessage());
			
			System.out.println("Exception has occured due to division with zero");
		}
	}

}
