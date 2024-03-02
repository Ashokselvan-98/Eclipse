package for1;

public class Check {
	public static void main(String[] args) {
		String a = "OneSOfT@#998";
		int b = 0;
		int c = 0;
		int d = 0;
		for (int i = 0; i <= a.length() - 1; i++) {
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
				b = b + 1;
			} else if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
				c = c + 1;
			} else if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {
				d = d + 1;
			} else {
				System.out.println(a.charAt(i));

			}
		}
		System.out.println("Upper case " + b);
		System.out.println("Lower case " + c);
		System.out.println("numbers " + d);
		
		int k =0;
		while(k<=a.length()-1) {
			System.out.println(a.charAt(k));
			k++;
		}
		
		int j=0;
		int cb=0;
		for(;j<=5;) {
			cb=cb+j;
			j++;
		}
System.out.println("total "+cb);
	}
}
