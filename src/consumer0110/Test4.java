package consumer0110;

import java.util.function.Supplier;

public class Test4 {

	public static void main(String[] args) {
		Supplier<Integer> s = () -> {
			return 30;
		};
		int a = s.get();
		System.out.println(a);
	}
}
