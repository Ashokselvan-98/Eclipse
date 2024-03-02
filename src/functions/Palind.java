package functions;

public class Palind {
	public String check(String a) {
		String b = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			b = b + a.charAt(i);
		}
		if (b.equals(a)) {
			return "Palindrome";
		} else {
			return "Not a planidrome";
		}
	}
}
