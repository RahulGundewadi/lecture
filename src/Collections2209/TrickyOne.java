package Collections2209;

import java.util.ArrayList;
import java.util.List;

// Store even number from 1 to 20 list and print list using for each loop
public class TrickyOne {

	public static void main(String[] args) {
		//1. number 1-20
		//2. filter even number
		//3.strore even number in list
		//4.print list
		
		List<Integer> evenNoList = new ArrayList<Integer>();
		
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				//System.out.println(i);
				
				evenNoList.add(i);
			}
		}
		for(int n : evenNoList) {
			System.out.println(n);
		}
	}
}
