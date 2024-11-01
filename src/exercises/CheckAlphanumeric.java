package exercises;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckAlphanumeric {
	
	static boolean checkalpha(String s) {
		Pattern pattern = Pattern.compile("[a-z]|[A-Z]");
		Matcher matcher = pattern.matcher(s);
		return matcher.find();
	}
	
	static boolean checkvowel(String s) {
		s=s.toLowerCase();
		Pattern pattern = Pattern.compile("a|e|i|o|u");
		Matcher matcher = pattern.matcher(s);
		return matcher.find();
	}

	public static void main(String[] args) {
		
		int consonants, vowels;
		String string = "Hello World!";
		String letter;
		
		vowels=0;
		consonants=0;
		
		for(int i=0;i<string.length();i++) {
			
			letter=string.substring(i,i+1);
			
			if(checkalpha(letter)) {

				if(checkvowel(letter)) vowels++;
				else consonants++;
				
			}else continue;
		}

		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
		
	}
}
