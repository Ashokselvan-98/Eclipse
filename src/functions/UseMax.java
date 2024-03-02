package functions;

public class UseMax {
	public static void main(String[] args) {
		Max m = new Max();
		int[] a = { 1, 6, 8, 9, 14, 2 };
		System.out.println(m.findmax(a));
		System.out.println(m.findmin(a));
		m.findeven(a);
	}

}
