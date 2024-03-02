package homework2;

public class Ak {
	public static void main(String[] args) {
		int a = 1;
		int b = 10;

		for (int i = 2; i < b; i++) {
			boolean as = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					as = false;
				}
			}
			if (as ==true) {
				System.out.println(i);
			}
		}
	}
}
