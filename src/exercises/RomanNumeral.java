package exercises;

import java.util.Scanner;

public class RomanNumeral {
	
	public static String toRoman(int n) {
		if(n<4000 && n>0) {
			
		}else return "Please enter a number between 1-3999";
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Hello!\n\nEnter either a roman number or a normal number and I'll convert it!(From 1 to 3999)\nYour number: ");
		String number = in.next();
		
		try {
			int n = Integer.parseInt(number); 
			System.out.println(toRoman(n));
			
		}catch (NumberFormatException e) {
			System.out.println("That's not a valid number.");
		}
		
		//if(Character.isDigit(number.charAt(0)))

	}

}
