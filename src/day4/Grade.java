package day4;

public class Grade {
	public static void main(String[] args) {
		int a = 75;
		if (a >= 90 && a < 100) {
			System.out.println("O");
		} else if (a >= 80 && a < 90) {
			System.out.println("A+");
		} else if (a >= 70 && a < 80) {
			System.out.println("A");
		} else if (a >= 60 && a < 70) {
			System.out.println("B+");
		} else if (a >= 50 && a < 60) {
			System.out.println("B");
		} else if (a >= 40 && a < 50) {
			System.out.println("c");
		} else {
			System.out.print("fail");
		}

	}
}
