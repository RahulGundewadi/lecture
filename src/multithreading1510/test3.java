package multithreading1510;

public class test3 {

	public static void main(String[] args) {
		
		Runnable r = () -> {
			for(int i=0; i<100; i++) {
				System.out.println("thread name : "
			+ Thread.currentThread().getName()+":"+i);
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}; 
		Thread t = new Thread(r);
		t.start();
	}
}
