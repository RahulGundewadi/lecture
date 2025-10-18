package multithreading1510;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		
		for(int i=0; i<10; i++) {
			System.out.println("Hello WOrld");
			Thread.sleep(10000);
			
			Animal1 a = new Animal1();
			a.start();
		}
	}
}
