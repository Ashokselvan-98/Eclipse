package homework2;

public class Q4palin {
	public static void main(String[] args) {
		String a = "i love my mom";
		String[] b = a.split(" ");
		String c = b[b.length - 1];
		String d = "";
		for (int i = c.length() - 1; i >= 0; i--) {
			d = d + c.charAt(i);
		}
		if (d.equals(c)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}

}

}
