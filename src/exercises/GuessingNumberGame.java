package exercises;

import java.util.Scanner;

public class GuessingNumberGame {

	public static void main(String[] args) {
				
		int randomNum = (int)(Math.random() * 101);
		Scanner in = new Scanner(System.in);
		int n;
		int counter = 0;
		
		while(true) {
			System.out.print("\nGuess the number: ");
			n=in.nextInt();
			counter++;
			if(n==randomNum){
				System.out.println("You did it!!!\nYou needed " + counter + " attempts");
				break;
			}
			if(n<randomNum)System.out.println("Too low, the num is higher");
			if(n>randomNum)System.out.println("Too high, the num is lower");
		}
		in.close();
	}
}
