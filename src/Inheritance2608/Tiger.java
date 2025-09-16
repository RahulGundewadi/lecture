package Inheritance2608;
//child
public class Tiger extends Animal {

	public Tiger() {
		System.out.println("In Tiger constractor");
	}
	@Override
	public void printName() {
		System.out.println("Tiger");
	}

	public void printColour() {
		System.out.println("yellow black");
	}
	
	
}
