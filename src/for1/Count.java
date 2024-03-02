package for1;

public class Count {
	public static void main(String[] args) {
		int a = 0;
		for (int i = 0; i <= 10; i++) {
			a = a + 1;
		}
		System.out.println(a);
		int b = 0;
		for (int i = 0; i <= 10; i++) {
			b = b + i;
		}
		System.out.println(b);

		int c = 0;
		int d = 0;
		for (int i = 500; i <= 1000; i++) {

			if (i % 2 == 0) {
				c++;
			} else {
				d++;
			}

		}
		System.out.println("even count="+c);

		System.out.println("odd count="+d);
	}

}