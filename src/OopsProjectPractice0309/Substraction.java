package OopsProjectPractice0309;

public class Substraction  extends Calculator{

	@Override
	public int Substraction(int a, int b) {
		// TODO Auto-generated method stub
		int sub = a-b;
		System.err.println(sub);
		return super.Substraction(a, b);
	}

	@Override
	public int Substraction(int a, int b, int c) {
		// TODO Auto-generated method stub
		int sub = a-b-c;
		System.err.println(sub);
		return super.Substraction(a, b, c);
	}

	@Override
	public int Substraction(int a, int b, int c, int d) {
		// TODO Auto-generated method stub
		int sub = a-b-c-d;
		System.err.println(sub);
		return super.Substraction(a, b, c, d);
	}

	@Override
	public int Substraction(int a, int b, int c, int d, int e) {
		// TODO Auto-generated method stub
		int sub = a-b-c-d-e;
		System.err.println(sub);
		return super.Substraction(a, b, c, d, e);
	}


}
