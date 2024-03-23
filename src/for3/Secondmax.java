package for3;

public class Secondmax {
	public static void main(String[] args) {
		int[] a = { 5, 90, 58, 20, 15 };

		int max = a[0];
		int secondMax = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				secondMax = max;
				max = a[i];
			} else if (a[i] > secondMax && a[i] != max) {
				secondMax = a[i];
			}
		}
		System.out.println(secondMax);

	}

}
