package PreDefinedFunction3009;

import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		
		Predicate<Integer> p = x -> x % 2 ==0;
		Boolean result = p.test(25);
		System.out.println(result);
		
		Predicate<String> pd  = y -> y.startsWith("A");
		System.out.println(pd.test("Monday"));
		
		Predicate<String> pb = n -> n.endsWith("l");
		System.out.println(pb.test("Animal"));
	}

}
