package AbstractPractie0409;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("selsect Employee type : 1.HR 2.Manager");
		int select = sc.nextInt();
		
		System.out.println("Enter salaray :");
		double salary = sc.nextDouble();
		
		Employee e;
		
		if(select == 1) {
			e = new HR(salary);
			e.printSalary();
		}else {
			e = new Manager(salary);
			e.printSalary();
		}
	}

}
