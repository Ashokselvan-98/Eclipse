package for3;

import java.util.Arrays;

public class Banana {
	public static void main(String[] args) {
		String a = "BANANA";
		char[] b = a.toCharArray();
		System.out.println(Arrays.toString(b));
		for (int i = 0; i < b.length; i++) {
			int c = 0;
			for (int j = i+1; j < b.length; j++) {
				if (b[i] == b[j]) {
					c=c+1;
					b[j] = '@';
				}
			}
			if (c > 0 && b[i]!= '@') {
				System.out.println(b[i] + " " + c);

			} 
		else if(c==0&&b[i]!='@'){
				System.out.println(b[i] + " " + c);
		}
		}
	}
}
