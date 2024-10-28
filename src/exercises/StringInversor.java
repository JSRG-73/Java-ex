package exercises;

import java.util.Scanner;

public class StringInversor {

	public static void main(String[] args) {
		
		Scanner inScanner = new Scanner(System.in);
		System.out.println("Write your string: ");
		String originalString = inScanner.nextLine();
		String aux = "";
		
		for (int i=originalString.length();i>0;i--) {
			aux+=originalString.substring(i-1,i);
		}
		System.out.println(aux);
	}
}
