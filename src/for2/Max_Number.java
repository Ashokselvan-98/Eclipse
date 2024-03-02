package for2;

public class Max_Number {
	public static void main(String[] args) {

		int[] a = { 10, 1150, 20, 19, 150, 2 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}

		}
		System.out.print(max);
	}
}
