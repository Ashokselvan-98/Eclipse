package homew1;

public class Cube {
	public static void main(String[] args) {
		int[] a = { 5, 7, 12, 4, 18, 21 };
		int b = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				a[i] = a[i] * a[i];
				b = b + 1;
				System.out.println("even square = " + a[i]);
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				a[i] = a[i] * a[i] * a[i];

				System.out.println("odd cube = " + a[i]);

			}
		}
		System.out.println("even count = " + b);
	}

}
