package functions;

public class Vwl {
	public void findvowel(String[] a) {
		for (String x : a) {
			if (x.contains("a") || x.contains("e") || x.contains("i") || x.contains("o") || x.contains("u")) {
				System.out.println(x);
			}
		}

	}

	public char[] findduplicate(String a) {
		char[] b = a.toCharArray();
		char[] d = new char[b.length];
		for (int i = 0; i < b.length; i++) {
			int c = 0;
			for (int j = i + 1; j < b.length; j++) {
				if (b[i] == b[j]) {
					c++;
					b[j] = '@';
				}
			}
			if (c > 0 && b[i] != '@') {
				d[i] = b[i];
			}
		}
		return d;
	}
}
