package OopsProjectPractice0309;

import java.util.Scanner;

public class Demo {


	public static void main(String[] args) {
		 Scanner sc =  new Scanner(System.in);
	
		 Calculator p;
	        p =  new Addition();
			p = new Substraction();
			p = new Multipliction();
		System.out.println("Select option ");
		System.out.println("1 . Addition");
		System.out.println("2 . Substraction");
		System.out.println("3 . Multiplition");
		
		int select = sc.nextInt();
		switch(select) {
		case 1 :{
		      System.out.println("Addition");
		      System.out.println("Enter how many number");
				
				int digit = sc.nextInt();
		       
					if(digit == 2) {
						  System.out.println("Addition of two number");
						 
						  int a = sc.nextInt();
						  int b = sc.nextInt();
						  p.Addition(a,b);
						  int sum = a+b;
						  System.out.println("Addition of two number is : " +sum);
					  }
					  else if(digit == 3) {
						  System.out.println("Addition of three number");
						  int a = sc.nextInt();
						  int b = sc.nextInt();
						  int c = sc.nextInt();
						  p.Addition(a, b , c);
						  int sum = a+b+c;
						  System.out.println("Addition of three number is : "+sum);
						 
						  
					  }
					  else if(digit == 4) {
						  System.out.println("Addition of four number");
						  int a = sc.nextInt();
						  int b = sc.nextInt();
						  int c = sc.nextInt();
						  int d = sc.nextInt();
						  p.Addition(a, b , c , d);
						  int sum = a+b+c+d;
						  System.out.println("Addition of four number is : "+sum);
					  }
					  else if(digit == 5) {
						  System.out.println("Addition of five number");
						  int a = sc.nextInt();
						  int b = sc.nextInt();
						  int c = sc.nextInt();
						  int d = sc.nextInt();
						  int e = sc.nextInt();
						  p.Addition(a, b , c , d ,e);
						  int sum = a+b+c+d+e;
						  System.out.println("Addition of five number is : "+sum);
					  
				}
		      break;
		}
		case 2 :{
		      System.out.println("Substraction");
		      System.out.println("Enter how many number");
				
				int digit = sc.nextInt();
		       
					if(digit == 2) {
						  System.out.println("Substraction of two number");
						 
						  int a = sc.nextInt();
						  int b = sc.nextInt();
						  p.Substraction(a,b);
						  int sub = a-b;
						  System.out.println("Substraction of two number is : " +sub);
					  }
					  else if(digit == 3) {
						  System.out.println("Substraction of three number");
						  int a = sc.nextInt();
						  int b = sc.nextInt();
						  int c = sc.nextInt();
						  p.Substraction(a, b ,c);
						  int sub = a-b-c;
						  System.out.println("Substraction of three number is : "+sub);
						 
						  
					  }
					  else if(digit == 4) {
						  System.out.println("Substraction of four number");
						  int a = sc.nextInt();
						  int b = sc.nextInt();
						  int c = sc.nextInt();
						  int d = sc.nextInt();
						  p.Substraction(a, b , c , d);
						  int sub = a-b-c-d;
						  System.out.println("Substraction of four number is : "+sub);
					  }
					  else if(digit == 5) {
						  System.out.println("Substraction of five number");
						  int a = sc.nextInt();
						  int b = sc.nextInt();
						  int c = sc.nextInt();
						  int d = sc.nextInt();
						  int e = sc.nextInt();
						  p.Substraction(a, b , c , d ,e);
						  int sub = a-b-c-d-e;
						  System.out.println("Substraction of five number is : "+sub);
					  
				}
		      break;
		}
		case 3 :{
		      System.out.println("Multiplition");
		      System.out.println("Enter how many number");
				
				int digit = sc.nextInt();
		       
					if(digit == 2) {
						  System.out.println("Multipliction of two number");
						 
						  int a = sc.nextInt();
						  int b = sc.nextInt();
						  p.Multipliction(a,b);
						  int mul = a*b;
						  System.out.println("Multipliction of two number is : " +mul);
					  }
					  else if(digit == 3) {
						  System.out.println("Multipliction of three number");
						  int a = sc.nextInt();
						  int b = sc.nextInt();
						  int c = sc.nextInt();
						  p.Multipliction(a, b ,c);
						  int mul = a*b*c;
						  System.out.println("Multipliction of three number is : "+mul);
						 
						  
					  }
					  else if(digit == 4) {
						  System.out.println("Multipliction of four number");
						  int a = sc.nextInt();
						  int b = sc.nextInt();
						  int c = sc.nextInt();
						  int d = sc.nextInt();
						  p.Multipliction(a, b , c , d);
						  int mul = a*b*c*d;
						  System.out.println("Multipliction of four number is : "+mul);
					  }
					  else if(digit == 5) {
						  System.out.println("Multipliction of five number");
						  int a = sc.nextInt();
						  int b = sc.nextInt();
						  int c = sc.nextInt();
						  int d = sc.nextInt();
						  int e = sc.nextInt();
						  p.Multipliction(a, b , c , d ,e);
						  int mul = a*b*c*d*e;
						  System.out.println("Multipliction of five number is : "+mul);
					  
				}
		      break;
		}
			
		}
		
		
	}
}