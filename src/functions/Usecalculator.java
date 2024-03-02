package functions;

public class Usecalculator {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.add();
		c1.sub(200, 45);
		System.out.println(c1.multiply());
		System.out.println(c1.divide(100,6));
	}

}
