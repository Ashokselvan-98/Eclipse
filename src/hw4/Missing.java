package hw4;

import java.util.Arrays;

public class Missing {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5 };
		int total = a[a.length - 1] * (a[a.length - 1] + 1) / 2;
		int sum = 0;
		int[] b = new int[a[a.length - 1]];
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			b[i] = a[i];
		}
		int c = total - sum;
		b[b.length - 1] = c;
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
	}
}
