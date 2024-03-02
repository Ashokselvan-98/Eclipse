package hw4;

import java.util.Arrays;

public class Arreql {
	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 6, 9, 8 };
		int[] b = { 1, 2, 5, 6, 9, 8 };
		if (Arrays.equals(a, b)) {
			System.out.println("Array are equal");
		} else {
			System.out.println("Not equal");
		}
	}

}
