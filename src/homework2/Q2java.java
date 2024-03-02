package homework2;

public class Q2java {
	public static void main(String[] args) {
		String a = "java";
		String b = "developer";
		String c = a.substring(0, a.length() / 2);
		String d = a.substring(a.length() / 2, a.length());
		System.out.println(c + b + d);
	}
}
