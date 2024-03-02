package day4;

public class Movie {
	public static void main(String[] args) {
		float a = 6.5f;
		if (a >= 0 && a <= 2.5) {
			System.out.println("Very Bad");
		} else if (a >= 2.5 && a < 5) {
			System.out.println("Bad");
		} else if (a >= 5 && a < 7.5) {
			System.out.print("Aeverage");
		} else if (a >= 7.5 && a < 9) {
			System.out.println("Good");
		} else {
			System.out.print("excellent");
		}

	}

}
