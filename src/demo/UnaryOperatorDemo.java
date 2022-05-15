package demo;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		
		
		int a = 6;  //6 /7
		
		int b = ++a;//7 /8
		
		int c = b++;//7 /6
		
		int d = --c;//6 /5
		
		int e = d--;//6
		
		System.out.println(a);//6
		System.out.println(b);//7
		System.out.println(c);//7
		System.out.println(d);//7
		System.out.println(e);//6

		
		System.out.println();
	}

}
