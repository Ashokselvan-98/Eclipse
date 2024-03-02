package functions;

import java.util.Arrays;

public class UseINte {
	public static void main(String[] args) {
		Inte i = new Inte();
		int[] a = { 1, 8, 5, 4, 3, 8, 2, 1 };
		int[] b = i.findint(a);
		System.out.print(Arrays.toString(b));

	}

}
