package exercises;

import java.util.Scanner;

public class LargestWord {

	public static void main(String[] args) {
		
		Scanner inScanner = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String string = inScanner.nextLine();	
		inScanner.close();
		
		string = string.replaceAll("!|,|\\.|\\?", "").toLowerCase().trim();
		String[] s_array = string.split("\\s+");
		int max=0;
		
		for(int i=0; i<s_array.length;i++) if(s_array[i].length()>max) max=s_array[i].length();
		
		for(int i=0; i<s_array.length;i++) if(s_array[i].length()==max) System.out.println(s_array[i]);
	}
}