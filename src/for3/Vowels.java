package for3;

public class Vowels {
	public static void main(String[] args) {
		String[] a = { "java", "fly", "sky", "python" };
		for (int i = 0; i < a.length; i++) {

			if (a[i].contains("a") || a[i].contains("e") || a[i].contains("i") || a[i].contains("o")
					|| a[i].contains("u")) {
				System.out.println(a[i]);
			}
		}
	}
}
