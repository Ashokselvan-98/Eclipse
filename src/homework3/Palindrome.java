package homework3;

public class Palindrome {

	public void findpalindrome(int a, int b) {
		for (int i = a; i <= b; i++) {
			int num = i;
			int d = 0;
			int org = num;
			for (; num > 0;) {
				int c = num % 10;
				d = d * 10 + c;
				num = num / 10;
			}
			if (org == d) {
				System.out.println(org + "as");
			}
		}
	}

}
