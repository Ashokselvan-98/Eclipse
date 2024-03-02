package day4;

public class Vowel {
	public static void main(String[] args) {
		String a = "bottle";
		if (a.contains("a") || a.contains("e") || a.contains("i") || a.contains("o") || a.contains("u")) {
			System.out.print("vowel");
		} else {
			System.out.print("not a vowel");
		}
	}

}
