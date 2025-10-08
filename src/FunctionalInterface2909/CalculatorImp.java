package FunctionalInterface2909;

public class CalculatorImp {
	
	public static void main(String[] args) {
		
		FICalculator substraction = (a,b) ->{
			System.out.println(a-b);
			
		};
		substraction.operation(50, 10);
		
		FICalculator Addition = (a,b) ->{
			System.out.println(a+b);
		};
		Addition.operation(50, 10);
		
		FICalculator Multiplition = (a,b) ->{
			System.out.println(a*b);
		};
		Multiplition.operation(50, 10);
		
		FICalculator Div = (a,b) ->{
			System.out.println(a*b);
		};
		Div.operation(50, 10);
		
		
	}

}
