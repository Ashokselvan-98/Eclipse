package day3;

public class USemobile {
	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.brand = "redmi";
		m1.price = Integer.parseInt(args[1]);
		m1.is5g = Boolean.parseBoolean(args[2]);
		Mobile m2 = new Mobile();
		m2.brand = "oppo";
		m2.price = Integer.parseInt(args[4]);
		m2.is5g = Boolean.parseBoolean(args[5]);
		String a = m1.brand.toUpperCase();
		String b = m2.brand.toUpperCase();
		int c = m1.price + m2.price;
		System.out.println("Brand:" + a + "," + b + " " + "Total:" + c);

	}

}
