package FunctionalInterface2909;

public class Addition {

	public static void main(String[] args) {
		
		FIAddition f = ( a ,  b) ->{
			System.out.println(a+b);
		};
		f.Addition(10, 30);
	}
//	@Override
//	public void Addition(int a, int b) {
//		System.out.println(a+b);
//		
//	}

	
}
