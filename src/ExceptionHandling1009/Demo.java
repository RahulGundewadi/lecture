package ExceptionHandling1009;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
	//p2
		System.out.println("Enter a : ");
		try {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			try {
			int div = 12/a;
			System.out.println(div);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		}catch(InputMismatchException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		}		
		
		
}	
		
		
		
		
		//p1
//		System.out.println("Enter a : ");
//		try {
//			Scanner sc = new Scanner(System.in);
//			int a = sc.nextInt();
//			int div = 12/a;
//			System.out.println(div);
//		}catch(ArithmeticException e ) {
//			e.printStackTrace();
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("end");
	

