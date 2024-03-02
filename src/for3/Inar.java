package for3;

public class Inar {
	public static void main(String[] args) {
		int[] a = { 2, 8, 6, 4, 1, 5, 3 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == 7) {
					System.out.println("("+a[i] + "," + a[j]+")");

				}
			}
		}

	}
}
