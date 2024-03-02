package for3;

public class Secondmax {
	public static void main(String[] args) {
		int[] a = { 24, 75, 82, 64, 35, 90 };
		int max = a[0];
		int secondmax = max;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				secondmax = max;
				max = a[i];
				

			}

		}
		System.out.println(secondmax);
	}

}
