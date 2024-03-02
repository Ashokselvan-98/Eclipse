package homew1;

public class UseSchool {
	public static void main(String[] args) {
		School s1 = new School();
		s1.name = "green park";
		s1.location = "nammakal";
		s1.rating = 3.75f;
		s1.strength = 1250;
		s1.iscoed = false;

		School s2 = new School();
		s2.name = "velammal";
		s2.location = "chennai";
		s2.rating = 3.5f;
		s2.strength = 1600;
		s2.iscoed = true;

		School s3 = new School();
		s3.name = "petit";
		s3.location = "pondicherry";
		s3.rating = 3.0f;
		s3.strength = 1000;
		s3.iscoed = false;

		School s4 = new School();
		s4.name = "jawahar";
		s4.location = "neyveli";
		s4.rating = 2.5f;
		s4.strength = 750;
		s4.iscoed = true;

		School[] a = { s1, s2, s3, s4 };

		for (int i = 0; i < a.length; i++) {
			if (a[i].iscoed == true && a[i].rating > 3) {
				System.out.println(a[i].name + " " + a[i].location);
			}
		}

	}
}
