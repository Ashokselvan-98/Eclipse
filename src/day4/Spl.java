package day4;

public class Spl {
	public static void main(String[] args) {
		String a = "Hello@world";
		char b = a.charAt(a.length() / 2);
		if (b >= 'A' && b < 'z') {
			System.out.println("alphabet");
		} else if (b >= '0' && b < '9') {
			System.out.println("number");

		} else {
			System.out.println("special charater");
		}

		String c = "North";
		char d = c.charAt(0);
		if (d == 'N') {
			System.out.println("north");
		} else if (d == 'S') {
			System.out.println("south");
		} else if (d == 'E') {
			System.out.println("east");
		} else {
			System.out.println("west");
		}
	}

}
