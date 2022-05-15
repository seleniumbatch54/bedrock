package iterating_statements;

public class StudentDetails {

	public static void main(String[] args) {

		
		int y = 1;
		
		
		int []rollNo = new int[5];

		rollNo[0] = 10;
		rollNo[1] = 20;
		rollNo[2] = 30;
		rollNo[3] = 40;
		rollNo[4] = 50;

		//System.out.println(rollNo[2]);
		System.out.println("Size of the array is: "+rollNo.length);
		
		int id[] = {100,200,300,400,500};
		//System.out.println(id[3]);
		
		/*
		for(int i=0;i<rollNo.length;i++) {
			
			System.out.print(rollNo[i]+" ");
		}*/
		
		
		for(int a:rollNo) {
			System.out.println(a);
		}

		for(int x:id) {
			System.out.println(x);
		}
	}

}
