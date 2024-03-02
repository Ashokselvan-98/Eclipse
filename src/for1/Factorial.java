package for1;

public class Factorial {
	public static void main(String[] args) {

		int a = 1;
		for (int i = 1; i <= 5; i++) {
			a = a * i;
		}
		System.out.println(a);
		int b = 1;
		for (int i = 10; i <= 20; i++) {
			if (i % 2 == 0) {
				b = b * i;
			}

		}
		System.out.println(b);
		int c = 1;
		for (int i = 10; i <= 20; i = i + 2) {
			c = c * i;
		}
		System.out.println(c);
	}
}
