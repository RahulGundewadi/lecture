package StreamAPIHomeWork;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demo3 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3);
		
		//1. collect
		list.stream().skip(1).collect(Collectors.toList());
		list.stream().skip(1).toList();
		
		
		//2. forEach
		list.stream().forEach(x -> System.out.println(x));
		
		//3. reduce
		Optional<Integer> optionalInteger =list.stream()
				.reduce((x,y) -> (x+y));
		System.out.println(optionalInteger.get());
		
		//4. count
		long res  = list.stream()
				.filter(x -> x%2 == 0)
				.count();
		System.out.println(res);
		
		//5. anyMatch, allMatch, noneMatch
		boolean b = list.stream()
				.anyMatch(x -> x%2 == 0);
		System.out.println(b);
		
		boolean b1 = list.stream()
				.allMatch(x -> x>0);
		System.out.println(b1);
		
		boolean b2 = list.stream()
				.noneMatch(x ->x<0);
		System.out.println(b2);
		
		System.out.println(list.stream()
				.findFirst()
				.get());
		System.out.println(list.stream()
				.findAny()
				.get());
		
		//7. toArray()
		
		Object[] array = Stream.of(1,2,3)
				.toArray();
		//8. min/max
		System.out.println("max:"+Stream.of(2,44,69)
		              .max((o1,o2) -> o2 - o1));
		
		System.out.println("min:"+Stream.of(2,44,69)
		.min(Comparator.naturalOrder()));
		
		//9. forEachOrdered
		List<Integer> numbers0 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println("Using forEach with parallel stream:");
		numbers0.parallelStream().forEach(System.out::println);
				
		
	}
}
