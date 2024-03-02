package homework3;

public class Findbinary {
	public static void main(String[] args) {
		String a = "i am from chennai";
		String[] b = a.split(" ");
		
		for (int i = 0; i < b.length; i++) {
			String c = "";
			for (int j = b[i].length() - 1; j >= 0; j--) {
				c = c + b[i].charAt(j);
			}

			System.out.print(c+" ");
		}
		
	}

}
