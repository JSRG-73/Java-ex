package exercises;

import java.util.Scanner;

public class PrimeNumberFinder {
	
	public static boolean check(int n) {
		for(int i = 2; i<n;i++) {
			if(n%i==0)return false;
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Prime number Finder");
		System.out.println("********************");
		System.out.println("Enter the lowest number of the range: ");
		int lowest = in.nextInt();
		System.out.println("Enter the highest number of the range: ");
		int highest = in.nextInt();
		
		for(int i = lowest;i<=highest;i++) {
			if(check(i))System.out.println(i);
		}
		
	}

}
