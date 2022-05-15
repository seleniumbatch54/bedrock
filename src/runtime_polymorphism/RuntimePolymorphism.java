package runtime_polymorphism;

public class RuntimePolymorphism {

	public static void main(String[] args) {
		
		/*
		COne a = new COne();
		a.show();
		
		CTwo b = new CTwo();
		b.show();
		
		CThree c = new CThree();
		c.show();
		
		CFour d = new CFour();
		d.show();
		
		*/
		/*
		COne c = new COne();
		c.show();
		c.appear();
		*/
		COne c = new CTwo();
		c.show();
		c.appear();
		//c.print();
		
		c = new CThree();
		c.show();
		c.appear();
		//c.display();
		
		c = new CFour();
		c.show();
		c.appear();
		//c.view();
	}

}
