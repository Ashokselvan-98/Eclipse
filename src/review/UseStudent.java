package review;

public class UseStudent {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "ashok";
		s1.rollno = 134;
		s1.english = 82;
		s1.math = 83;
		s1.science = 65;
		s1.social = 77;
		s1.tamil = 75;
		int a = s1.english + s1.math + s1.science + s1.social + s1.tamil;
		float b = a / 5f;
		if (b >= 80) {
			System.out.print(b + 5 % b);
		} else if (b >= 60 && b < 80) {
			System.out.print(b + 3 % b);
		} else if (b >= 40 && b < 60) {
			System.out.print(b + 1.5 % b);
		} else {
			System.out.print("fail");
		}
	}
}
