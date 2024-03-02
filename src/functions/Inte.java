package functions;

public class Inte {
	public int[] findint(int[]a) {
		int[] ak = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int c = 0;
			for (int j = i+1; j < a.length; j++) {
				if (a[i] == a[j]) {
					c++;
					a[j] = '@';
				}
			}
			if (c > 0 && a[i] != '@') {
				ak[i] = a[i];

			}
			
		}
		return ak;
	}

}
