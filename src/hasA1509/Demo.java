package hasA1509;

public class Demo {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.setId(101);
		s.setName("Rahul");
		s.setCity("salagare");
		
		PersonalDetails p = new PersonalDetails();
		
		p.setFatherName("abc");
		p.setMatherName("xyz");
		
		s.setDetails(p);
		
		System.out.println(s.toString());
		
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getCity());
		System.out.println(s.getDetails().getFatherName());
		System.out.println(s.getDetails().getMatherName());
		
	}
}
