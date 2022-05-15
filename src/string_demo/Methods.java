package string_demo;

public class Methods {

	public static void main(String[] args) {

		/*
		String s = "Java";

		int count = s.length();

		System.out.println(count);
		System.out.println(s.length());

		int x = 10;

		int y = 20;

		int z = x+y;

		System.out.println(z);
		System.out.println(x+y);
		 */

		/*
		String s = "Java";

		char result = s.charAt(2);
		System.out.println(result);
		System.out.println(s.charAt(6));
		 */

		/*
		String s1 = "Java";

		String s2 = "Programming";

		System.out.println(s1);

		System.out.println(s2);

		s1 = s1.concat(s2);

		System.out.println(s1);
		 */

		/*
		String s1 = "A";//65

		String s2 = "b";//97 /98 /66

		System.out.println(s1.compareTo(s2));

		System.out.println(s1.compareToIgnoreCase(s2));
		 */

		/*
		String s1 = "Java";

		String s2 = "java";
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equalsIgnoreCase(s2));
		*/
		/*
		String s = "Java Program";
		System.out.println(s.startsWith("Java"));
		System.out.println(s.endsWith("gram"));
		*/
		
		/*
		String s = "Java Program";
		
		System.out.println(s.indexOf('J'));
		System.out.println(s.lastIndexOf('a'));
		*/
		
		/*
		String s = "Jar Joy";
		
		System.out.println(s);
		System.out.println(s.replace('J', 'B'));
		*/
		
		/*
		String s = "Java Programming Language";
		
		System.out.println(s);
		System.out.println(s.substring(5));
		System.out.println(s.substring(5,16 ));
		*/
		
		/*
		String s = "fcdGJGJVD cdcvd SHDJSVSFCD";
		System.out.println(s);
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		*/
		
		
		/*
		String s = "    Java    Program          ";
		
		System.out.println(s);
		System.out.println(s.trim());
		*/
		
		/*
		String s1 = new String("Java");
		System.out.println(s1);
		
		String s2 = s1.intern();
		System.out.println(s2);
		*/
		
		String s1 = new String("Java");
		String s2 = new String("Java");
		String s3 = "Java";
		String s4 = "Java";
		
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//true
		System.out.println(s3.equals(s4));//true
		
		System.out.println(s1==s2);//false
		System.out.println(s1==s3);//false
		System.out.println(s3==s4);//true
	}

}
