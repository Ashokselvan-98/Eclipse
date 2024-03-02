package for3;

public class Duplicate {
	public static void main(String[] args) {
		String a = "I AM DAVID AND I AM FROM CHENNAI";
		String[] b = a.split(" ");
		for (int i = 0; i < b.length; i++) {
			int count = 0;
			for (int j = i + 1; j < b.length; j++) {
				if (b[i].equals(b[j])) {
					count++;
					b[j] = "$";
				}
			}
			if (count > 0 && b[i] != "$") {
				System.out.println(b[i] + " " + count);
			}
		}

	}

}
