package exception_handling;

public class Sample {

	public static void main(String[] args) {

		String s = "Java Programming";


		try {

			System.out.println("Hi");

			//System.out.println(2/0);

			System.out.println(s.charAt(19));
			
			int ar[] = new int[3];
			ar[0] = 5;
			ar[1] = 15;
			ar[2] = 25;
			ar[4] = 5;
			
			int a[]= {1,2,3,4,5};
			
		}
		/*
		catch(ArithmeticException a) {
			System.out.println("Arithmetic Exception has occured");
		}

		catch(StringIndexOutOfBoundsException a) {
			System.out.println("String Exception has occured");
		}
		
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Arrays Exception has occured");
		}*/
		
		catch(ArithmeticException|StringIndexOutOfBoundsException|ArrayIndexOutOfBoundsException a) {
			System.out.println("Exception Occured");
		}

		finally {
			
				System.out.println("Welcome");
		}
		System.out.println("Bye");


	}

}
