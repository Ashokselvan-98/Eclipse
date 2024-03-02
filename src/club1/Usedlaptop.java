package club1;

public class Usedlaptop {
	public static void main(String[]args) {
		Laptop L=new Laptop();
		L.brand="HP";
		L.price=80000;
		L.taxpercent=15;
		L.taxamount=L.price*L.taxpercent/100;
		L.discountpercentage=10;
		L.discountamount=L.price*L.discountpercentage/100;
		L.netprice=L.price+L.taxamount-L.discountamount;
		
		System.out.println("brand="+L.brand+","+"Tax="+L.taxamount+","+"Discount="+L.discountamount+","+"Net price="+L.netprice);
		
		
	}

}
