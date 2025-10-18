package MapHomeWork;

import java.util.LinkedHashMap;

public class linkedHashMap {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		
		
		map.put(101, "Java");
		map.put(102, "Spring");
		map.put(103, "Boot");
		map.put(101, "Updated");
		map.put(null, "Nullkey");
		map.put(104, null);
		
		System.out.println("map :" +map);
		System.out.println("value for key 103 : " +map.get(103));
		System.out.println("all keys : "+map.keySet());
		System.out.println("all values : " +map.values());
		
		map.remove(102);
		System.out.println("after removing key 102 : " +map);
	}
}
