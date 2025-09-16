package AbstractPractie0409;

public abstract class Employee {

	double salary;
	
	public  Employee(double salary){
		this.salary = salary;
	}
	public abstract void printSalary();
}
