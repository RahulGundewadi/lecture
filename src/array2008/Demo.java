package array2008;

public class Demo {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.setId(100);
		s.setName("Rahul");
		s.setCity("miraj");
		
		Student s1 = new Student();
		s1.setId(102);
		s1.setName(" rahul");
		s1.setCity("salagare");
		
		Student s2 = new Student();
		s2.setId(101);
		s2.setName("rakesh");
		s2.setCity("kolhapur");
		
		Student s4 = new Student();
		s4.setId(101);
		s4.setName("ramesh");
		s4.setCity("karad");
		
		// replase value
		Student[] studentArray = {s,s1,s4};
		//studentArray[1] = s4;
		
		
		for(int i = 0; i<studentArray.length;i++) {
			//ISystem.out.println(studentArray[i]);
			
			/*Student StudentFromArray = studentArray[i];
			System.out.println(StudentFromArray.getId());
			System.out.println(StudentFromArray.getName());
			System.out.println(StudentFromArray.getCity());*/
			
			
			/*System.out.println(studentArray[i].getId());
			System.out.println(studentArray[i].getName());
			System.out.println(studentArray[i].getCity());*/
			
			if(studentArray[i].getCity().equals("karad")) {
				
				System.out.println(studentArray[i].getId());
				System.out.println(studentArray[i].getName());
				System.out.println(studentArray[i].getCity());
				
			}
		
		}
	}
}
