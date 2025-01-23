package exercises;

import java.util.Scanner;

public class NumberSpiral {

	private int n;
	private int arr[][];
	private int counter;

	public NumberSpiral(int n) {
		this.n = n;
		this.arr = new int[n][n];
		this.counter = 0;
	}

	public void square(int first, int last) {

		for (int i = first; i <= last; i++) {	//left-right filling
			if (arr[first][i] == 0) {
				counter++;
				arr[first][i] = counter;
			}
		}
		for (int i = first; i <= last; i++) {	//up-down filling
			if (arr[i][last] == 0) {
				counter++;
				arr[i][last] = counter;
			}
		}
		for (int i = last; i >= first; i--) {	//right-left filling
			if (arr[last][i] == 0) {
				counter++;
				arr[last][i] = counter;
			}
		}
		for (int i = last; i >= first; i--) {	//down-up filling
			if (arr[i][first] == 0) {
				counter++;
				arr[i][first] = counter;
			}
		}
	}

	public void completeMatrix() {
		for (int i = 0; i < n; i++) {
			square(i, n-1-i);
		}
	}

	public void showMatrix() {
		System.out.println("\n");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n;
		System.out.print("Please enter a number between 1 and 20: ");

		while (true) {
			try {
				n = in.nextInt();
				if(n>0 && n<21)break;
				else System.out.print("Your number is out of range, please enter a number between 1 and 20: ");
				
			} catch (Exception e) {
				System.out.print("That's not a valid input, please enter a number between 1 and 20: ");
				in.nextLine();
			}
		}
		in.close();

		NumberSpiral obj = new NumberSpiral(n);

		obj.completeMatrix();
		obj.showMatrix();
	}
}