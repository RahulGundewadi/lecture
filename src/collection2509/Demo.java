package collection2509;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(12);
		System.out.println(l.toString());
		
		
		List<Integer> la = new ArrayList<Integer>(2);
		la.add(12);
		la.add(22);
		la.add(121);
		System.out.println(la.toString());
		
		List<Integer> lb = Arrays.asList(1,2,3,4,5,6,7,2,5);
		
		
		Integer[] array = {1,2,3,5,4,8};
		List<Integer> lc = Arrays.asList(array);
		lc.add(1256);
		System.out.println ( Arrays.asList(array).toString());
	}
}
