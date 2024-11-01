package exercises;

import java.util.Scanner;

public class DigitReplacer {

	public static void main(String[] args) {

		Scanner inScanner = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String string = inScanner.nextLine();		
		
		System.out.println(string.replaceAll("[0123456789]", "*"));
		inScanner.close();
	}

}
