package for2;

public class psitive {
	public static void main(Str[] args) {
		int[] a = new int[5];
		a[0] = 22;
		a[1] = -14;
		a[2] = 55;
		a[3] = -2;
		int p = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 0) {
				p = p + 1;
			} else {
				System.out.println(a[i]);
			}
		}
		System.out.println("total=" + p);
	}
}
