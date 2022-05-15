package conditional_statements;

public class SwitchStatements {

	public static void main(String[] args) {
		
		byte a = 1;
		short b = 2;
		
		int c = 3;
		
		long d = 4;
		
		char choice = 'A';
		
		
		switch(a) {
		
		case 1:System.out.println("First Choice");
		
				break;
		case 2:System.out.println("Second Choice");
		case 3:System.out.println("Third Choice");
				break;
		case 4:System.out.println("Fourth Choice");
		case 65:System.out.println("SixtyFifth Choice");
		
		default: System.out.println("default Choice");
		
		}
		
		
		if(a==2) {
			System.out.println("First Choice");
		}
		else if(a==2) {
			System.out.println("Second Choice");
		}
		else if(a==3) {
			System.out.println("Third Choice");
		}
		else if(a==4) {
			System.out.println("Fourth Choice");
		}
		else if(a==65) {
			System.out.println("SixtyFifth Choice");
		}
		
		else {
			System.out.println("default Choice");
		}
		

	}

}
