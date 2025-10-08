package ExceptionHandling0909;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		System.out.println("code started");
		
		int a = 12;
		Scanner sc = new Scanner(System.in);
				
		int value = sc.nextInt();
		
		try {
			int div = 12/value;
			System.out.println(div);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("finally block");
		}
		
	}
}

