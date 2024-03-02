package for1;

public class Crt {
	public static void main(String[] args) {
		String a = "AshoK@134";
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
				System.out.println(a.charAt(i));
			} else if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {
				System.out.println(a.charAt(i));
			} else if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
				System.out.println(a.charAt(i));
			} else
				System.out.println(a.charAt(i));
		}

	}

}
