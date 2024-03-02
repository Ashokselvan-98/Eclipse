package homework3;

public class Dupli {
	public int[] duplicate(int[] a) {
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int c = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					c++;
					a[j] = '@';
				}
			}
			if (c > 0 && a[i] != '@') {
				b[i] = a[i];
			}

		}
		return b;
	}

}
