package homework2;

public class Q7eql {
	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 8, 7 };
		int[] b = { 1, 2, 5, 8, 7 };
		boolean isequal = true;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				isequal = false;
			}
		}
		if (isequal == true) {
			System.out.print("Arrays are equal");
		} else {
			System.out.println("arrays are not equal");

		}
	}

}
