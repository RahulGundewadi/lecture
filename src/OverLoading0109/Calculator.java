package OverLoading0109;
//overloading-> compile time polymorphism
public class Calculator {
	
	//constructor overloading
	public Calculator() {
		
	}
	
    public Calculator(int a) {
		
	}
	
	
    public Calculator(int a , int b) {
	
    }
	
	
	
	
	
	
	
	
	

	//ex - 1-> method overloading
	public void addition(int a , int b) {
		
		int sum = a+b;
		System.out.println("sum of two numbers : " + sum);
		
	}
	//return type ,access modifier wont matter in overloading
	//protected void addition(int x , int y){

	//int sum = x+y;
	//System.out.println("sum of two numbers : " + sum);
    //}
	
    public void addition(int a , int b , int c) {
		
		int sum = a+b+c;
		System.out.println("sum of three numbers : " + sum);
		
	}
    //ec 2 -> method overloading seq of parameters changed
    
    public void printSomething(String name, int id) {
    	
    }
    
public void printSomething(int id,String name) {
    	
    }
}
