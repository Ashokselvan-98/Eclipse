package functions;

import java.util.Arrays;

public class UseVwl {
	public static void main(String[] args) {
		String[] a = { "strawberry", "apple", "fly", "try", "beer" };
		Vwl v = new Vwl();
		v.findvowel(a);
		String b = "banana";
		char[] c = v.findduplicate(b);
		System.out.print(Arrays.toString(c));
	}
}
