package for3;

public class Prime {
	public static void main(String[] args) {
//		for (int i = 1; i <= 20; i++) {
//			boolean b = true;
//			for (int j = 2; j < i; j++) {
//				if (i % j == 0) {
//					b = false;
//				}
//			}
//			if (b == true) {
//				System.out.println(i);
//			}
//		}
		
		for(int i = 1; i <= 10; i++) {
			boolean b = true;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					b = false;
				}
			}
			if(b == true) {
				System.out.println(i);
			}
		}

	}
}
