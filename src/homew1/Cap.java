package homew1;

public class Cap {
	public static void main(String[] args) {
		String[] a = { "APPLE", "Orange", "banana", "LEMON" };
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals(a[i].toUpperCase())) {
				System.out.println(a[i]);
			}

		}
	}
}