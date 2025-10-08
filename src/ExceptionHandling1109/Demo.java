package ExceptionHandling1109;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo {

	public static void main(String[] args) {
	
		Demo d = new Demo();
		try {
		d.div();
		}catch (Exception e){
			e.printStackTrace();
		}
		System.out.println("End");
		
		
		
	}	
		
	public void div() throws ArithmeticException{
		int a = 12/0;
	}
		
		
		
}		
		
		
//		//compileTime using throw
//		Demo d = new Demo();
//		
//		try {
//			d.anything();
//			
//		}catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//	}
//		
//		
//		public void anything() throws FileNotFoundException{
//	        Demo d = new Demo();
//			d.something();
//		}
//		
//		public void something() throws FileNotFoundException{
//			FileReader reader = new FileReader("abc.txt");
//		}
 

