package hw4;

public class DuplicateArr {
	public static void main(String[] args) {
		int[] a = { 1, 2, 6, 5, 7, 9, 2, 5, 9 };

		int[] c = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int b = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					b++;
					a[j] = '@';
				}
			}
			if (a[i] != '@' && b > 0) {
				c[i] = a[i];
			}
		}

		for (int i = 0; i < c.length; i++) {
			int max;
			for (int j = i + 1; j < c.length; j++) {

				if (c[i] < c[j]) {
					max = c[i];
					c[i] = c[j];
					c[j] = max;
				}
			}
			System.out.print(c[i] + " ");

		}
	}
}
