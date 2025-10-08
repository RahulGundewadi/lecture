package Collections2209;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
//		//with generic
//		
//		List<String> l = new ArrayList<String>();
//		
//		l.add("asd");
//		l.add("mnb");
//		//l.add(123); not allowed
//		
//		System.out.println(l.toString());
//		
//		//without generics
//		
//		List la = new ArrayList();
//		la.add("pune");
//		la.add(123);
//		la.add(false);
//		
//		System.out.println(la.toString());
		
		List<String> l = new ArrayList<String>();
		
		l.add("asd");
		l.add("mnb");
		//l.add(123); not allowed
		
		System.out.println(l.toString());
		
		for(String v : l) {
			System.out.println(""+v.toUpperCase());
		}
	}
}
