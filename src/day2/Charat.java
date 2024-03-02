package day2;

public class Charat {public static void main(String[]args) {
	String a="hello how are you?";
	char b=a.charAt(0);
	int c=a.length()/2;
	int d= a.length()-1;
	char e= a.charAt(c);
	char f=a.charAt(d-1);
	System.out.println(b+" "+e+" "+f);
	char g=a.charAt(d-2);
	System.out.println(g);
	
	}

}
