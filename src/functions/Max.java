package functions;

public class Max {
	public int findmax(int[] a) {
		int b = a[0];
		for (int c : a) {
			if (b < c) {
				b = c;
			}
		}
		return b;
	}

	public int findmin(int[] a) {
		int c = a[0];
		for (int x : a) {
			if (c > x) {
				c = x;
			}

		}
		return c;
	}

	public void findeven(int[] a) {
		for (int x : a) {
			if (x % 2 == 0) {
				System.out.println(x);
			}
		}

	}

}
