
package for1;

public class Prime {
	public static void main(String[] args) {

		int a = 13;
		boolean b = true;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				b = false;
			}

		}
		if (b == true) {
			System.out.print("prime number");
		} else {
			System.out.print("not a prime number");
		}
	}
}
