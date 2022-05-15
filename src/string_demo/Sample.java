package string_demo;

public class Sample {

	public static void main(String[] args) {
		
		String s = "Java";
		
		
		String a = "1Java2";
		
		int c = 2;
		int b = 3;
		
		//System.out.println(c+b);
		
		System.out.println(1+2+3+s);//6Java
		
		System.out.println(1+s+2+3);//1Java23
		
		System.out.println(1+2+s+3);//3Java3
		
		System.out.println(s+1+2+3);//Java123
		
		System.out.println((1+2)+s+3);//3Java3
		
		System.out.println(1+s+(2+3));//1Java5

	}

}
