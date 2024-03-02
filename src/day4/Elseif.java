package day4;

public class Elseif {
	public static void main(String[] args) {
		int a = 100;
		int b = 105;
		int c = 200;
		if (a > b && a > c) {
			System.out.print("a is biggest");
		} else if (b > a && b > c) {
			System.out.print("b is bigg");
		} else {
			System.out.print("c is bigg");
		}
	}

}
