package iterating_statements;

public class ContinueStatement {

	public static void main(String[] args) {

		int a = 20;
		
		for(int i=1;i<=20;i++) {

			if(i==7 || i==13) {
				continue;
			}	System.out.println(i);
		}

	}

}
