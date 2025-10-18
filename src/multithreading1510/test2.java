package multithreading1510;

public class test2 {

	public static void main(String[] args) {
		
		System.out.println("main thread");
		
		Animal2 aThread = new Animal2();
		
		Thread t =new Thread(aThread);
		
		t.start();
		
	}
}
