package for3;

public class Assending {
	public static void main(String[] args) {
		int[] a = { 24, 7, 82, 95, 64, 87 };
		for (int i = 0; i < a.length; i++) {
			int temp;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print(a[i] + " ");
	}
		
		
	}

}
