package for1;

public class Practisewhile {
	public static void main(String[] args) {
		String a = "AshokKumar@134";
		int i = 0;
		String b = "";
		String c = "";
		String e = "";
		String d = "";
		for (; i <= a.length() - 1;) {
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
				b = b + a.charAt(i);
			} else if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
				c = c + a.charAt(i);
			} else if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {
				e = e + a.charAt(i);
			} else {
				d = d + a.charAt(i);

			}
			i++;
		}

		System.out.println(b);
		System.out.println(c);
		System.out.println(e);
		System.out.println(d);
		int j=0;
		int p = 0;
		int q = 0;
		int r = 0;
		while (j <= a.length() - 1) {
			if (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z') {
				p = p + 1;
			} else if (a.charAt(j) >= 'a' && a.charAt(j) <= 'z') {
				q = q + 1;
			} else if (a.charAt(j) >= '0' && a.charAt(j) <= '9') {
				r = r + 1;
			}
			j++;
		}
		System.out.println("Upper " + p);
		System.out.println("Lower " + q);
		System.out.println("number " + r);
	}
}
