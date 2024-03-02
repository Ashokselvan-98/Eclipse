package functions;

public class Pen {
	String name;
	int price;
	float tipmm;

	public Pen findpen(Pen[] a) {
		Pen b = a[0];
		for (Pen x : a) {
			if (b.price < x.price) {
				b = x;
			}
		}

		return b;
	}

	public Pen findmin(Pen[] a) {
		Pen c = a[0];
		for (Pen x : a) {
			if (c.price > x.price) {
				c = x;
			}
		}
		return c;

	}

	public int findavg(Pen[] a) {
		int ttl = 0;

		for (Pen s : a) {
			ttl = ttl + s.price;

		}
		int avg = ttl / a.length;
		return avg;
	}
}
