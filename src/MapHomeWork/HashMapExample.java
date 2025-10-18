package MapHomeWork;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		
	
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Java");
		map.put(2, "Spring");
		map.put(3, "Boot");
		map.put(1, "Updated");
		map.put(null, "Nullkey");
		map.put(4, null);
		
	//	System.out.println("map :"+ map);
	//	System.out.println("value for key 2 : " + map.get(2));
	//	System.out.println("contains key 3?" +map.containsKey(2));
	//	System.out.println("All keys : "+ map.keySet());
	//	System.out.println("All values : " +map.values());
		
	//	map.remove(2);
	//	System.out.println("After removing key 2 :"+ map);
	}
}
