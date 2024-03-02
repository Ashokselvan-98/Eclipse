package homework3;

import java.util.Arrays;

public class UseDupli {
	public static void main(String[] args) {
		Dupli d = new Dupli();
		int[] a = { 1, 2, 5, 9, 7, 3, 5, 9 };
		int[] b = d.duplicate(a);
		System.out.println(Arrays.toString(b));
	}
}
