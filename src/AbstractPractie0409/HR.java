package AbstractPractie0409;

public class HR extends Employee{

	public HR(double salary) {
		super(salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printSalary() {
		// TODO Auto-generated method stub
		double revised = salary - (salary*0.20);
		System.out.println("Revised HR Salary is : "  +revised);
		
	}

}
