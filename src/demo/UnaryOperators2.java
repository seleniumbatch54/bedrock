package demo;

public class UnaryOperators2 {

	public static void main(String[] args) {
		

		int a = 9;  //9 /8 /7
		
		int b = a--;//9 /10 /11
		
		int c = ++b;//10 /11 /10
		
		int d = ++c;//11 /10 /11
		
		int e = --d;//10 /9
		
		int f = --a - b++ + c-- + ++d - --e;//7 - 10 + 11 + 11 - 9 = 10
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);

	}

}
