package review;

public class UseObject {
	public static void main(String[] args) {
		Object b1 = new Object();
		b1.brand = "fastrack";
		b1.price = 2500;
		b1.isWaterProof = false;
		b1.model = "cx124f";
		Object b2 = new Object();
		b2.brand = "casio";
		b2.price = 6000;
		b2.isWaterProof = true;
		b2.model = "aj34k";
		Object b3 = new Object();
		b3.brand = "fossil";
		b3.price = 12000;
		b3.isWaterProof = true;
		b3.model = "25sdf";
		if (b1.price > b2.price && b1.price > b3.price) {
			System.out.print(b1.brand + " is costly");
		} else if (b2.price > b1.price && b2.price > b3.price) {
			System.out.print(b2.brand + " is costly");
		} else {
			System.out.print(b3.brand + " is costly");
		}

	}
}
