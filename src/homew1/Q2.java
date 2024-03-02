package homew1;

public class Q2 {
	public static void main(String[] args) {
		String[] a = { "ashok", "nagamurali", "selva", "cheranjevi" };
		String b = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i].length() > b.length()) {
				b = a[i];

			}

		}
		System.out.println("longest string = "+b);
	}
}
