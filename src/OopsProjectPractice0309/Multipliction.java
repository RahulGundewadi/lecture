package OopsProjectPractice0309;

public class Multipliction extends Calculator {

	@Override
	public int Multipliction(int a, int b) {
		// TODO Auto-generated method stub
		int mul = a*b;
		System.err.println(mul);
		return super.Multipliction(a, b);
	}

	@Override
	public int Multipliction(int a, int b, int c) {
		// TODO Auto-generated method stub
		int mul = a*b*c;
		System.err.println(mul);
		return super.Multipliction(a, b, c);
	}

	@Override
	public int Multipliction(int a, int b, int c, int d) {
		// TODO Auto-generated method stub
		int mul = a*b*c*d;
		System.err.println(mul);
		return super.Multipliction(a, b, c, d);
	}

	@Override
	public int Multipliction(int a, int b, int c, int d, int e) {
		// TODO Auto-generated method stub
		int mul = a*b*c*d*e;
		System.err.println(mul);
		return super.Multipliction(a, b, c, d, e);
	}

	
	
}