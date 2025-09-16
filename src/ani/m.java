package ani;

import java.util.Scanner;

public class m {
public static void main(String[] args) {
	 Scanner sc =  new Scanner(System.in);
		
	 cal C;
	 C = new add();
	 System.out.println("Select option");
	 int select = sc.nextInt();
	 
	 if(select == 1) {
		  System.out.println("Addition of two number");
		  int a = sc.nextInt();
		  int b = sc.nextInt();
		  int sum = C.addition(a, b);
		  System.out.println("Addition of two number is : " +sum);
	  }
	  else if(select == 2) {
		  System.out.println("Addition of three number");
		  int a = sc.nextInt();
		  int b = sc.nextInt();
		  int c = sc.nextInt();
		  int sum = C.a(a, b,c);
		  System.out.println("Addition of three number is : " +sum);
	  }
	  else if(select == 3) {
		  System.out.println("Addition of four number");
		  int a = sc.nextInt();
		  int b = sc.nextInt();
		  int c = sc.nextInt();
		  int d = sc.nextInt();
		  int sum = C.add(a, b,c,d);
		  System.out.println("Addition of four number is : " +sum);
	  }
	  else if(select == 4) {
		  System.out.println("Addition of five number");
		  int a = sc.nextInt();
		  int b = sc.nextInt();
		  int c = sc.nextInt();
		  int d = sc.nextInt();
		  int e = sc.nextInt();
		  int sum = C.add(a, b,c,d,e);
		  System.out.println("Addition of five number is : " +sum);
	  }
}
}
