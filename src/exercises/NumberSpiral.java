package exercises;

import java.util.Scanner;

public class NumberSpiral {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a number between 1-20: ");
		int n = in.nextInt();
		
		int arr[][] = new int[n][n];
		
		
		
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
