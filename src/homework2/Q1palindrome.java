package homework2;

public class Q1palindrome {
	public static void main(String[] args) {
//		int a = 747;
//		int temp = a;
//		int sum = 0;
//		int result = 0;
//		while (a > 0) {
//			sum = a % 10;
//			result = (result * 10) + sum;
//			a = a / 10;
//		}
//		if (result == temp) {
//			System.out.println("palindrome");
//		} else {
//			System.out.println("not a palindrome");
//		}
		
		for(int i =222; i < 500; i++) {
			int org = i;
			int res = 0;
			while(i > 0) {
				int mod = i % 10;
				res = (res * 10) + mod;
				i = i / 10;
			}
			if(res == org) {
				System.out.println(org);
			}
		}
	}
}
