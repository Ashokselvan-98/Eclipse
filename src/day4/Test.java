package day4;

public class Test {
	public static void main(String[] args) {
		String a = "test";
		char b = a.charAt(0);
		char c = a.charAt(a.length() - 1);
		if (b == c) {
			System.out.print("true");
		} else {
			System.out.print("false");
		}

	}

}
