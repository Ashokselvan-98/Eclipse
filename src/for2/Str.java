package for2;

public class Str {
	public static void main(String[] args) {
		String[] a = new String[5];
		a[0] = "Apple";
		a[1] = "Orange";
		a[2] = "Grapes";
		a[3] = "Berry";
		a[4] = "strawberry";
		int p = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i].endsWith("s")) {
				System.out.println(a[i]);
			} else if (a[i].charAt(0) >= 'A' || a[i].charAt(0) <= 'Z') {
				p = p + 1;
			}
		}
		for (int i = 0; i < a.length; i++) {

			if (a[i].length() > 6) {
				System.out.println("length=" + a[i]);
			}
		}
		System.out.println("total=" + p);
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i].charAt(a[i].length() - 1));
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("-" + a[i].charAt(i));
		}
		String[] b = { "strawberry" ,"Apple", "fly", "try", "beer"};
		String k = b[0];
		for (int i = 0; i < b.length; i++) {
			if (b[i].contains("a") || b[i].contains("e") || b[i].contains("i") || b[i].contains("o")
					|| b[i].contains("u") || b[i].contains("A")) {
			} else {
				System.out.println(b[i]);
			}

		}
		for (int i = 0; i < a.length; i++) {
			if (b[i].length() < k.length()) {
				k=b[i];

			}
		}
		System.out.println("small="+k);
	}

}
