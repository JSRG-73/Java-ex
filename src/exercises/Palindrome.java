package exercises;
import java.util.Scanner;

public class Palindrome {

	static String function1(String sentenceString) {
		
		sentenceString=sentenceString.replace(" ", "");
		sentenceString=sentenceString.replace("á", "a");
		sentenceString=sentenceString.replace("é", "e");
		sentenceString=sentenceString.replace("í", "i");
		sentenceString=sentenceString.replace("ó", "o");
		sentenceString=sentenceString.replace("ú", "u");
		sentenceString=sentenceString.toLowerCase();
		
		
			for(int i=0;i<(sentenceString.length()/2);i++) {
				if(sentenceString.substring(i,i+1).equals(sentenceString.substring(sentenceString.length()-i-1,sentenceString.length()-i))) {
					continue; //System.out.println(true);
				} else {
					return "It's not a palindrome"; //System.out.println(false);
				}
			}
		
		return "It's a palindrome";
	}

	public static void main(String[] args) {

		Scanner inScanner = new Scanner(System.in);
		String sentenceString;
		while(true) {
			System.out.println("Type your String: ");
			sentenceString = inScanner.nextLine();
			System.out.println(function1(sentenceString));
		}
		//inScanner.close();
	}
}
