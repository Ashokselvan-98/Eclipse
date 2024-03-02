package day3;

public class Usemobilem1 {
	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		String[] a = args[0].split(",");
		m1.brand = a[0];
		m1.price = Integer.parseInt(a[1]);
		m1.is5g = Boolean.parseBoolean(a[2]);
		Mobile m2 = new Mobile();
		String[] b = args[1].split(",");
		m2.brand = b[0];
		m2.price = Integer.parseInt(b[1]);
		m2.is5g = Boolean.parseBoolean(b[2]);
		int c = m1.price + m2.price;
		System.out.println(m1.brand + " " + m2.brand + " " + c);

	}
}
