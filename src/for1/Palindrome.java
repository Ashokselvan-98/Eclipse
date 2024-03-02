package for1;

public class Palindrome {
	public static void main(String[] args) {
		String a = "mom";
		String b = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			b = b + a.charAt(i);
		}
		if (a.equals(b)) {
			System.out.print("palindrome");
		} else {
			System.out.print("not a palindrome");
		}
	}
}
