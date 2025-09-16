package OopsBasicProject0309;

public class Demo {

	public static void main(String[] args) {
		
		/*Employee e = new Employee();
		e.printSalary();*/
		
		/*Employee e = new HR();
		e.printSalary();
		
		Employee e1 = new Developer();
		e1.printSalary();*/
		
		Employee e;
		
		e = new HR();
		e.printSalary();
		e = new Developer();
		e.printSalary();
	}
}
