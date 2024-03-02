package club1;

public class company {
	public static void main(String[]args) {
		properties ps = new properties();
		ps.brand="samsung";
		ps.colour="white";
		ps.price=49999;
		ps.weight=205.2f;
		ps.istrue=false;
		System.out.println(ps.brand+" "+ps.colour+" "+ps.price+" "+ps.weight+" "+ps.istrue);
		properties ps1=new properties();
		ps1.brand="sony";
		ps1.colour="black";
		ps1.price=69999;
		ps1.weight=225.6f;
		ps1.istrue=true;
		System.out.println(ps1.brand+" "+ps1.colour+" "+ps1.price+" "+ps1.weight+" "+ps1.istrue);
	}

}
