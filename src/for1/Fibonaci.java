package for1;

public class Fibonaci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i <= 5; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
		String p = "program";
		for (int i = 0; i < p.length(); i++) {
			if (p.charAt(i) == 'a' || p.charAt(i) == 'e' || p.charAt(i) == 'i' || p.charAt(i) == 'o'
					|| p.charAt(i) == 'u') {
				System.out.println(p.charAt(i));
				
			}

		}
	}
}
