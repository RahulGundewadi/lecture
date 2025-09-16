package AbstractPractie0409;

public class Manager extends Employee{

	public Manager(double salary) {
		super(salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printSalary() {
		// TODO Auto-generated method stub
		double revised = salary - (salary*0.10);
		System.out.println("Revised Manager Salary is : "  +revised);
		
	}

}
