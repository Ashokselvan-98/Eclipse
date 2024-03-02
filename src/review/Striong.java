package review;

public class Striong {
	public static void main(String[] args) {

		String a = "program";
		char b = a.charAt(a.length() / 2);
		String c = a.substring(a.length() / 2-1, a.length() / 2+1);
		if (a.length() % 2 == 0) {
			System.out.print(c);
		} else {
			System.out.print(b);
		}

	}

}