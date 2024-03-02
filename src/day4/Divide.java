package day4;

public class Divide {
	public static void main(String[] args) {
		int a = 7;
		if (a % 2 == 0 && a % 3 == 0) {
			System.out.println("2&3 divisible");
		} else if (a % 2 == 0) {
			System.out.println("2is divisible");
		} else if (a % 3 == 0) {
			System.out.println("3 is divisible");
		} else {
			System.out.println("not divisible");
		}

		int b = 0;
		if (b > 0) {
			System.out.println("positive");
		} else if (b < 0) {
			System.out.println("negative");
		} else {
			System.out.println("Zero");
		}
		int c = 23;
		if (c < 20 && c >= 16) {
			System.out.println("cool");
		} else if (c < 25 && c >= 20) {
			System.out.println("normal");
		} else {
			System.out.println("hot");
		}
	}

}
