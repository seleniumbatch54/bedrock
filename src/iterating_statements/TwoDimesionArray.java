package iterating_statements;

public class TwoDimesionArray {

	public static void main(String[] args) {
		
		int ar[][] = new int[4][2];
		
		ar[0][0] = 10;
		ar[0][1] = 20;
		
		ar[1][0] = 30;
		ar[1][1] = 40;
		
		ar[2][0] = 50;
		ar[2][1] = 60;
		
		ar[3][0] = 70;
		ar[3][1] = 80;
		
		
		int a[][] = {{10,20},{30,40},{50,60},{70,80}};
		
		/*
		for(int i=0;i<ar.length;i++) {
			
			for(int j=0;j<ar[i].length;j++) {
				
				System.out.print(ar[i][j]+"  ");
			}System.out.println();
		}
		*/
		
		
		for(int row[]:ar) {
			
			for(int column:row) {
				System.out.print(column+" ");
			}System.out.println();
		}
		
		int x[][][] = new int[3][2][2];
		
		for(int i[][]:x) {
			for(int j[]:i) {
				for(int k:j) {
					System.out.println(k);
				}
			}
		}
		
	}

}
