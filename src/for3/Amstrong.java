package for3;

public class Amstrong {
	public static void main(String[] args) {
		int num = 371;
		int original = num;
		int temp = 0;
		int result = 0;
		for (int i = 0; i < num; i++) {
			int r = num % 10;
			temp = r * r * r;
			result = result + temp;
			num = num / 10;
		}
		if (result == original) {
			System.out.println("Amstrong");
		}
	}

}
