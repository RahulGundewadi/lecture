package PreDefinedFunction3009;

import java.util.function.Function;

public class Test2 {

	

	public static void main(String[] args) {
		
	Function<Integer , Integer> square = x -> x*x;
	Integer a = square.apply(5);
	System.out.println(a);
	
	//count number of alphabates in string
	
	Function<String , Integer> alp = s -> s.length();
		
		int as = alp.apply("monday");
		System.out.println(as);
	
		//*********
		Function<Integer, Integer> addTwo = x -> x+2;
		Function<Integer, Integer> addThree = x -> x+3;
		
		System.out.println(addTwo.andThen(addThree).apply(5));
	}
}
