package consumer0110;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test3 {

	public static void main(String[] args) {
	
		Consumer<String> c = (x) ->{
			String s = x.toLowerCase();
			System.out.println(s.length());
		};
		//c.accept("wednesday");
		
		List<Integer> list = Arrays.asList(23,558,66,94,12);
		
		Consumer<List<Integer>> ca = (x) ->{
			for(int a : x) {
				System.out.println(a);
			}
		};
		ca.accept(list);
	}
}
