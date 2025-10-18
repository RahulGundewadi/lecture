package IntermediateOperators0710;

import java.util.Arrays;
import java.util.List;

public class TerminalOperators {

	public static void main(String[] args) {
		 
		List<Integer> l = Arrays.asList(198,32,33,4,54,65,78,28,19,10);
		
		//iteration -> foreach -> terminal operator
		l.stream().forEach(x -> System.out.println(x));
		
		l.stream()
		.filter(x -> x%3 == 0)
		.filter(x -> x%2 == 0)
		.map(y -> y*10)
		.forEach(x -> System.err.println(x));
		
		Long v = l.stream()
		.filter(x -> x%3 == 0)
		.filter(x -> x%2 == 0)
		.map(y -> y*10)
		.count();
		System.out.println("count is :" + v);
		
	}
}
