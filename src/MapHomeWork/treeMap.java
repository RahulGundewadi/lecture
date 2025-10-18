package MapHomeWork;

import java.util.TreeMap;

public class treeMap {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap<>();
		
		map.put(3, "Boot");
	    map.put(1, "Java");
	    map.put(2, "Spring");
		map.put(4, null); 
		//map.put(null, "NullKey"); 
		
		System.out.println("sorted map : " + map);
		System.out.println("first key : " +map.firstKey());
		System.out.println("last key : " +map.lastKey());
		System.out.println("ceiling of 2 :" +map.ceilingKey(2));
		System.out.println("higher than 2 : " +map.higherKey(2));
		
		map.remove(3);
		System.out.println("after removing key 3 : "+map);
		
	}
}
