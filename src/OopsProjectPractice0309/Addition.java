package OopsProjectPractice0309;

public class Addition extends Calculator{



	

	@Override
	public int Addition(int a, int b) {
		// TODO Auto-generated method stub
		int sum = a+b;
		System.err.println(sum);
		return super.Addition(a,b);
	}

	
	@Override
	public int Addition(int a, int b, int c) {
		// TODO Auto-generated method stub
		int sum = a+b+c;
		System.err.println(sum);
		return super.Addition(a, b, c);
	}


	@Override
	public int Addition(int a, int b, int c, int d) {
		// TODO Auto-generated method stub
		int sum = a+b+c+d;
		System.err.println(sum);
		return super.Addition(a, b, c, d);
	}

	@Override
	public int Addition(int a, int b, int c, int d, int e) {
		// TODO Auto-generated method stub
		int sum = a+b+c+d+e;
		System.err.println(sum);
		return super.Addition(a, b, c, d, e);
	}


	
}

