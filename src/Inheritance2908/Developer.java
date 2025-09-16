package Inheritance2908;

public class Developer extends Employe {


	@Override
	public void printCity() {
		// TODO Auto-generated method stub
		super.printCity();
		System.out.println("sangli");
	}

	int age = 22;
	
	int empID = 101 ;
	
	
	public void printproject() {
		System.out.println("Google");
	}


	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
