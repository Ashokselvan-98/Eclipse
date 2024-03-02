package functions;

public class Hw1 {
	public String findlgt(String a) {

		if (a.length() > 5) {
			if (a.length() % 2 == 0) {
				return a.substring(a.length() / 2 - 1, a.length() / 2 + 1);

			} else {
				return a.substring(a.length() / 2 - 1, a.length() / 2);

			}
		} else {
			return "this is invalid data";
		}
	}

}
