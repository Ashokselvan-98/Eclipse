package day2;

public class Splits {public static void main(String[]args) {
	String a="panimalar";
	String[]b=a.split("a");
	System.out.println(b[1]);
	String c="2+3";
	String[]d=c.split("\\+");
	System.out.print(d[0]);
	
}

}