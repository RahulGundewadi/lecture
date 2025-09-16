package overRiding0209;

public class Lion extends Animal {
	
	public Lion() {
		this(23);
	}
	
	public Lion(int a) {
		System.out.println("a in constructor is : " + a);
	}

	public int number = 123;
	
	
	@Override
	public void printName() {
		// TODO Auto-generated method stub
		System.out.println("print name- lion");
	}

	public void printColor() {
		System.out.println("yello black stripped");
	}
	
	public void something() {
		System.out.println("something method");
		System.out.println(this.number);
		this.printColor();
		this.printName();
	}
	

}
