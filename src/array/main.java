package array;

public class main {

public static void main(String[] args) {
		
	student p = new student();
		p.setId(10);
		p.setName("ghhj");
		p.setCity("kolhapur");
		
		student p1 = new student();
		p1.setId(11);
		p1.setName("asd");
		p1.setCity("satara");
		
		student p2 = new student();
		p2.setId(12);
		p2.setName("lkkj");
		p2.setCity("pune");
		
		student p4 = new student();
		p4.setId(14);
		p4.setName("tfh");
		p4.setCity("karad");
		
		student[] parray = {p,p1,p2};
		
		for(int i = 0; i<parray.length-1;i++) {
			
			System.out.println(parray[i]);
		}
		
	}
}
