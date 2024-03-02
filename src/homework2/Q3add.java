package homework2;

public class Q3add {
	public static void main(String[] args) {
		String a = "2-1+3";
		String[] b = a.split("\\-");
		String[] c = b[1].split("\\+");
		int p = Integer.parseInt(b[0]);
		int q = Integer.parseInt(c[0]);
		int r = Integer.parseInt(c[1]);
		int s = p - q + r;
		System.out.println(s);
	}
}
