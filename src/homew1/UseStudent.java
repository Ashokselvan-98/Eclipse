package homew1;

public class UseStudent {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "ashok";
		s1.age = 25;
		s1.mobile = 9865125407l;
		s1.roll = 1439;
		s1.fees = 25000;
		s1.ispresent = true;

		Student s2 = new Student();
		s2.name = "aravind";
		s2.roll = 14;
		s2.age = 26;
		s2.fees = 28000;
		s2.mobile = 9854762135l;
		s2.ispresent = false;

		Student s3 = new Student();
		s3.name = "ajith";
		s3.roll = 34;
		s3.age = 28;
		s3.fees = 30000;
		s3.mobile = 9876543210l;
		s3.ispresent = true;

		Student s4 = new Student();
		s4.age = 26;
		s4.fees = 32000;
		s4.name = "manoj";
		s4.roll = 55;
		s4.mobile = 6543219870l;
		s4.ispresent = false;

		Student[] a = { s1, s2, s3, s4 };
		for (int i = 0; i < a.length; i++) {
			if (a[i].roll >= 1 && a[i].roll <= 20) {
				System.out.println(a[i].name + " - a section");
			} else if (a[i].roll >= 21 && a[i].roll <= 40) {
				System.out.println(a[i].name + " - b section");
			} else if (a[i].roll >= 41 && a[i].roll <= 60) {
				System.out.println(a[i].name + " - c section");
			} else if (a[i].ispresent == true) {
				System.out.println(a[i].name + " " +.92*a[i].fees);
			}
		}

	}

}
