package type_casting;

public class TypeCasting {

	public static void main(String[] args) {
		
		/*
		//Case1
		AOne a = new AOne();
		a.a1();
		*/
		
		/*
		//Case2
		ATwo a = new ATwo();
		a.a1();
		a.a2();
		*/
		
	
		/*
		byte x = 10;
		int y = (int)x;
		//Case3
		AOne a1 = new ATwo();
		a1.show();
		a1.display();
		a1 = new AThree();
		a1.show();
		a1.display();
		*/
		
		
		//Case4
		ATwo a = (ATwo)new AOne();
		a.show();
		a.display();
		a.print();
	
		
		/*
		//Case5
		ATwo a1 = new ATwo();
		AOne a2 = a1;
		ATwo a3 = (ATwo) new ATwo();
		a3.show();
		a3.display();
		a3.print();
		*/ 
		

	}

}
