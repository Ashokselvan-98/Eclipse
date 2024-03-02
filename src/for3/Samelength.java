package for3;

public class Samelength {
	public static void main(String[] args) {
		String a = "Test with a good prototype";
		String[] b = a.split(" ");
		for (int i = 0; i < b.length; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[i].length() == (b[j].length())) {
					System.out.println(b[i] + " " + b[j]);

				}
			}
		}
	}
}