package functions;

public class Section {
	public String name(String a) {
		if (a.charAt(0) >= 'a' && a.charAt(0) <= 'h') {
			return "1";
		} else if (a.charAt(0) >= 'i' && a.charAt(0) <= 'p') {
			return "2";
		} else if (a.charAt(0) >= 'q' && a.charAt(0) <= 'z') {
			return "3";
		}

		else {
			return "not a section";
		}

	}

}
