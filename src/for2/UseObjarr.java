package for2;

public class UseObjarr {
	public static void main(String[] args) {
		Objarr b1 = new Objarr();
		b1.brand = "hero";
		b1.model = "arf";
		b1.cc = 150;
		b1.price = 75000;
		b1.ispetrol = true;

		Objarr b2 = new Objarr();
		b2.brand = "yamaha";
		b2.model = "yah";
		b2.cc = 180;
		b2.price = 85000;
		b2.ispetrol = true;

		Objarr b3 = new Objarr();
		b3.brand = "pulsar";
		b3.model = "ghr";
		b3.cc = 200;
		b3.price = 90000;
		b3.ispetrol = true;

		Objarr b4 = new Objarr();
		b4.brand = "royal";
		b4.model = "classic";
		b4.cc = 350;
		b4.price = 200000;
		b4.ispetrol = false;

		Objarr[] a = { b1, b2, b3, b4 };
		for(Objarr x:a) {
		//for (int i = 0; i < a.length; i++) {
			System.out.println(x.brand);
		}

//		for (int i = 0; i < a.length; i++) {
//			if (a[i].ispetrol == true) {
//				System.out.println("-" + a[i].brand + " " + a[i].cc);
//
//			}
//		}
//		Objarr p = a[1];
//		for (int i = 0; i < a.length; i++) {
//			if (a[i].price > p.price) {
//				p = a[i];
//			}
//		}
//		System.out.println(p.brand);
//		for (int i = 0; i < a.length; i++) {
//			if (a[i].cc > 150 && a[i].model.length() > 3) {
//				System.out.println(a[i].brand + " " + a[i].price);
//			}
//		}
	}
}