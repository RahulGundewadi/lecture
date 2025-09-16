package Inheritance2908;


public class Demo {

	public static void main(String[] args) {
	//	Developer d = new Developer();
	
		//d.printVehical();
		
		//Developer.printVehical();
		//System.out.println(Developer.abc);
		
		Employe e =  new Employe();
		System.out.println(e.empID);
		System.out.println(e.name);
		e.printCity();
		e.printSalary();
		e.printVehical();
	}
}
