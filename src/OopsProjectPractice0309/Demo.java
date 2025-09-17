package OopsProjectPractice0309;

import java.util.Scanner;

public class Demo {


	public static void main(String[] args) {
		 Scanner sc =  new Scanner(System.in);
	
		Calculator p;
	       /* p =  new Addition();
			p = new Substraction();
			p = new Multipliction();*/
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
				 
			        p =  new Addition();
					if(digit == 2) {
						  System.out.println("Addition of two number");
						  int a = sc.nextInt();
						  int b = sc.nextInt();
						  System.out.println("Addition of two number is : " );
						  p.Addition(a,b);
						 
					  }
					  else if(digit == 3) {
						  System.out.println("Addition of three number");
						  int a = sc.nextInt();
						  int b = sc.nextInt();
						  int c = sc.nextInt();
						  System.out.println("Addition of three number is : ");
						  p.Addition(a, b , c);
						 
					  }
					  else if(digit == 4) {
						  System.out.println("Addition of four number");
						  int a = sc.nextInt();
						  int b = sc.nextInt();
						  int c = sc.nextInt();
						  int d = sc.nextInt();
						  System.out.println("Addition of four number is : ");
						  p.Addition(a, b , c , d);
						  
					  }
					  else if(digit == 5) {
						  System.out.println("Addition of five number");
						  int a = sc.nextInt();
						  int b = sc.nextInt();
						  int c = sc.nextInt();
						  int d = sc.nextInt();
						  int e = sc.nextInt();
						  System.out.println("Addition of five number is : ");
						  p.Addition(a, b , c , d ,e);
					  
				}else {
					System.err.println("defoult number");
				}
		      break;
		}
		case 2 :{
		      System.out.println("Substraction");
		      System.out.println("Enter how many number");
				
				int digit = sc.nextInt();
				p = new Substraction();
					if(digit == 2) {
						  System.out.println("Substraction of two number");
						  int a = sc.nextInt();
						  int b = sc.nextInt();
						  System.out.println("Substraction of two number is : " );
						  p.Substraction(a,b);
						  
					  }
					  else if(digit == 3) {
						  System.out.println("Substraction of three number");
						  int a = sc.nextInt();
						  int b = sc.nextInt();
						  int c = sc.nextInt();
						  System.out.println("Substraction of three number is : ");
						  p.Substraction(a, b ,c);
						  
					  }
					  else if(digit == 4) {
						  System.out.println("Substraction of four number");
						  int a = sc.nextInt();
						  int b = sc.nextInt();
						  int c = sc.nextInt();
						  int d = sc.nextInt();
						  System.out.println("Substraction of four number is : ");
						  p.Substraction(a, b , c , d);
					  }
					  else if(digit == 5) {
						  System.out.println("Substraction of five number");
						  int a = sc.nextInt();
						  int b = sc.nextInt();
						  int c = sc.nextInt();
						  int d = sc.nextInt();
						  int e = sc.nextInt();
						  System.out.println("Substraction of five number is : ");
						  p.Substraction(a, b , c , d ,e);
				}else {
					System.err.println("defoult number");
				}
		      break;
		}
		case 3 :{
		      System.out.println("Multiplition");
		      System.out.println("Enter how many number");
				
				int digit = sc.nextInt();
				p = new Multipliction();
					if(digit == 2) {
						  System.out.println("Multipliction of two number");
						  int a = sc.nextInt();
						  int b = sc.nextInt();
						  System.out.println("Multipliction of two number is : " );
						  p.Multipliction(a,b);
						  
					  }
					  else if(digit == 3) {
						  System.out.println("Multipliction of three number");
						  int a = sc.nextInt();
						  int b = sc.nextInt();
						  int c = sc.nextInt();
						  System.out.println("Multipliction of three number is : ");
						  p.Multipliction(a, b ,c);
						  
					  }
					  else if(digit == 4) {
						  System.out.println("Multipliction of four number");
						  int a = sc.nextInt();
						  int b = sc.nextInt();
						  int c = sc.nextInt();
						  int d = sc.nextInt();
						  System.out.println("Multipliction of four number is : ");
						  p.Multipliction(a, b , c , d);
					  }
					  else if(digit == 5) {
						  System.out.println("Multipliction of five number");
						  int a = sc.nextInt();
						  int b = sc.nextInt();
						  int c = sc.nextInt();
						  int d = sc.nextInt();
						  int e = sc.nextInt();
						  System.out.println("Multipliction of five number is : ");
						  p.Multipliction(a, b , c , d ,e);
				}else {
					System.err.println("defoult number");
				}
		      break;
		}
			
		}
		
		
	}
}