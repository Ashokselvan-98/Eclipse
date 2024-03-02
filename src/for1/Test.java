package for1;

public class Test {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		for (int i = 1; i <= 5; i++) {
			a = a + i;
			b = a * b;

		}
		System.out.println(b);
		int a1 = 0;
		int b1 = 1;
		int c;
		int d = 0;
		System.out.println(a1);
		System.out.println(b1);
		for (int i = 0; i <= 6; i++) {
			c = a1 + b1;
			d = d + c;
			System.out.println(c);
			a1 = b1;
			b1 = c;

		}
		System.out.print("total " + d);
	}

}
