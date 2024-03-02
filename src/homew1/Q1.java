package homew1;

public class Q1 {
	public static void main(String[] args) {
		int[] a = { 8, 5, 3, 7, 2 };
		int b = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < b) {
				b = a[i];
			}
		}
		System.out.println("smallest="+b);
	}

}
