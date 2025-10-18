package StreamAPIHomeWork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class demo2 {

	public static void main(String[] args) {
		
		//****Intermediate operator****//
		
		//1.filter
		List<String> list = Arrays.asList("Akshit","Ram","Shyam","Ghanshyam", "Akshit");
		Stream<String> filteredStream = list.stream()
		.filter(x -> x.startsWith("A"));
		long res = list.stream().filter(x -> x.startsWith("A")).count();
		System.out.println(res);
	
		//2.map
		Stream<String> stringstream = list.stream().map(x -> x.toUpperCase());
		
	//	String nm = list.stream().map(x -> x.toUpperCase());
		//System.out.println(nm);
		
		//3. sorted
		Stream<String> sortedStream = list.stream().sorted();
		Stream<String> sortedStreamUsingComparator = list.stream().sorted((a ,b) -> a.length() - b.length());
		
		//4. distinct -> removes duplicate
		System.out.println(list.stream()
				.filter(x -> x.startsWith("A"))
				.distinct()
				.count());
		
		//5. limit
		System.out.println(Stream.iterate(1, x -> x+1)
				.limit(100)
				.count());
		
		//6. skip
		System.out.println(Stream.iterate(1, x -> x+1)
				.skip(10)
				.limit(100)
				.count());
		//7.peek
		
		Stream.iterate(1, x -> x + 1)
		.skip(10)
		.limit(100)
		.peek(System.out::println).count();
		
		List<List<String>> listOfLists = Arrays.asList(
				Arrays.asList("apple","banana"),
				Arrays.asList("orange", "kiwi"),
				Arrays.asList("pear", "grape")
				);
		System.out.println(listOfLists.get(1).get(1));
		System.out.println(listOfLists.stream()
				.flatMap(x -> x.stream())
				.map(String::toUpperCase)
				.toList());
		
		List<String> sentences = Arrays.asList(
				"Hello world",
				"Java streams are powerful",
				"flatMap is useful"
				);
		
		System.out.println(sentences.stream()
				.flatMap(sentence ->Arrays.stream(sentence.split("")))
				.map(String::toUpperCase)
				.toList());
	}
}
