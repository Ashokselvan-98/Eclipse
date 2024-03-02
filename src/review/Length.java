package review;

public class Length {
	public static void main(String[] args) {
		String a = "Onesofts";

		if (a.length() >= 0 && a.length() < 3) {
			System.out.print(a.length() + "is string length");
		} 
		else if (a.length() >= 3 && a.length() < 5) {
			System.out.print(a.length() + ",is string length");
		}
        else if (a.length() >= 5 && a.length() < 8) {
			System.out.print(a.length() + ",is string length");
		} 
        else if (a.length() >= 8 && a.length() < 10) {
			System.out.print(a.length() + ",is string length");
		}
	}

}
