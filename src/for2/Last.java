package for2;

public class Last {
	public static void main(String[] args) {
		int a = 2356;
		int sum = 0;
		int result = 0;
		int count =0;
		while(a>0) {
			sum = a % 10;
			result = result + sum;
			a = a / 10;
			count++;
		}
		System.out.println(result+" "+count);
		
	}
}
