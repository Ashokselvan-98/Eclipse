package functions;

public class Sorti {
	public  char[] findsort(String a) {
		char[] b = a.toCharArray();
char[] ch = new char[b.length];
		for (int i = 0; i < b.length; i++) {
			char c = 0;
			for (int j = i + 1; j < b.length; j++) {

				if (b[i] > b[j]) {
					c = b[i];
					b[i] = b[j];
					b[j] = c;
				}
			}
			ch[i]=b[i];
		}
		return ch;
	}
}
