package homework3;

public class Armstrong {
	public void Findarmstrong(int a, int b) {
		for (int i = a; i <= b; i++) {
		int p = i;
		int sum = 0;
		int num = p;
		for(;p>0;) {
			int q = p % 10;
			sum = sum + q * q * q * q;
			p = p / 10;
		}
		if (num == sum) {
			System.out.println(sum+" amstro");
		}

		}
	}
}
