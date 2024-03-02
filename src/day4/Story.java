package day4;

public class Story {
	public static void main(String[] args) {
		int a = 7;

		if (a >= 0 && a < 5) {
			System.out.println(a*2);
		} else if (a >= 6 && a < 10) {
			System.out.println(a*5);
		} else if (a >= 10 && a < 20) {
			System.out.println(a*7);
		} else if (a >= 30 && a < 20) {
			System.out.println(a*13);
		} else {
			System.out.println("your membership cancelled");
		}
	}

}
