package for1;

public class Range {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 5 || i == 10) {
				continue;
			} else {
				System.out.println(i);
			}
		}
	}
}
