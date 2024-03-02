package functions;

public class USepen {
	public static void main(String[] args) {
		Pen p1 = new Pen();
		p1.name = "cello";
		p1.price = 25;
		p1.tipmm = 0.7f;
		Pen p2 = new Pen();
		p2.name = "flair";
		p2.price = 20;
		p2.tipmm = 0.5f;

		Pen p3 = new Pen();
		p3.name = "classmate";
		p3.price = 40;
		p3.tipmm = 0.7f;
		Pen[] a = { p1, p2, p3 };
		Pen p5 = new Pen();
		Pen b = p5.findpen(a);
		System.out.println(b.price + " " + b.name);
		Pen p9 = new Pen();
		Pen min = p9.findmin(a);
		System.out.println(min.price + " " + min.name);
		Pen p4 = new Pen();
		int c = p4.findavg(a);
		System.out.print(c);
	}
}