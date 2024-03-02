package day4;

public class ANOR {
	public static void main(String[] args) {
		float a = 4.30f;
		if (a >= 1.00f && a < 3.00f || a >= 13.00f && a < 15.00f) {
			System.out.println("Lunch Time");
		} else if (a >= 3.00f && a < 5.00f || a >= 15.00f && a < 17.00f) {
			System.out.println("Break Time");
		} else {
			System.out.println("free");
		}
	}
}
