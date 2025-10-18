package StreamAPIHomeWork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(1,2,3,4,5);
		
		System.out.println(number.stream().filter(x -> x%2 == 0).count());
		
		//1. from collections
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> stream = list.stream();
		
		
		//2. from arrays
		String[] array = {"a","b","c"};
		Stream<String> stream1 =Arrays.stream(array);
		
		//3. using Stream.of()
		Stream<String> Stream2 = Stream.of("a","b");
		
		//4.Infinite streams
		Stream.generate(() -> 1);
		Stream.iterate(1 , x -> x+1);
		
		
	}
}
