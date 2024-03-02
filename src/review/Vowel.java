package review;

public class Vowel {
	public static void main(String[] args) {

		String a = "fly";
		if (a.contains("a") || a.contains("e") || a.contains("i") || a.contains("o") || a.contains("u")) {
			System.out.print(a + " is a vowel");
		} else {
			System.out.print(a + " is not a vowel");
		}
	}
}
