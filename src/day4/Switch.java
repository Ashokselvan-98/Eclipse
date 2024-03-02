package day4;

public class Switch {
	public static void main(String[] args) {
		String a = "Tuesday";
		switch (a) {
		case "Monday":
			System.out.println("Monday");
			break;
		case "Tuesday":
			System.out.println("Tuesday");
			break;
		case "Wednesday":
			System.out.print("Wednesday");
			break;
		case "Thursday":
			System.out.println("Thursday");
			break;
		case "Friday":
			System.out.println("friday");
			break;
		case "saturday":
			System.out.print("saturday");
			break;
		case "sunday":
			System.out.print("sunday");
			break;
		default:
			System.out.print("invalid");
			break;
		}

	}

}
