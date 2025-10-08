package consumer0110;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Test6 {

	public static void main(String[] args) {
		
		BiPredicate<Integer , Integer> b = (x , y) ->{
			int a = (x+y)/2;
			return a%2 == 0;
		};
		Boolean v = b.test(12, 12);
		System.out.println(v);
		
		//------------------//
		
		BiConsumer<String , String> biConsumer = (x , y) -> {
		System.out.println(x);
		System.out.println(y);
		};
		biConsumer.accept("Rahul" , "Gundewadi");
		
		
		//---------------------------//
		
		BiFunction<Integer , Integer ,Integer> biFunction = (x , y) -> {
			int sum = x+y;
			return sum;
		};
		int sum = biFunction.apply(20, 30);
		System.out.println(sum);
	}
}
