package Multithreading1410;

public class test2 {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		employee2 e = new employee2();
		e.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("main method :"
			+Thread.currentThread().getName());
		}
		System.out.println("end");
	}
}
