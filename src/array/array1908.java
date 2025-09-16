package array;

public class array1908 {

	public static void main(String[] args) {
		
		/*Object[] heteroArray = {12,"ss",23.33,};
		System.err.println(heteroArray[3]);*/
		
		int[] rollNo = {11,12,13,14,15};
		
		System.out.println(rollNo.length);
		
		//for(int i = 0; i<rollNo.length;i++) {
			//System.out.println(rollNo[i]);
		//}
		for(int i = rollNo.length-1;i>=0;i--) {
			System.out.println(rollNo[i]);
		}
		/*for(int i = 0 ;i<= rollNo.length;i+=2) {

		System.out.println(rollNo[i]);
		}*/
	}

}
