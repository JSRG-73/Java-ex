package exercises;

//Simple Fibonacci practice

public class Fibonacci {

	public static void main(String[] args) {

		int a=0;
		int b=1;
		int c=0;
		
		int series_length = 20;
		
		System.out.print(a+","+b);
		
		for(int i=0;i<series_length;i++) {
			c=a+b;
			System.out.print(","+c);
			a=b;
			b=c;
		}

	}

}
