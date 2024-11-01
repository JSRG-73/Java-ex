package exercises;
import java.util.Scanner;

public class Anagramchecker {
	
	static boolean checker(String s1, String s2) {

		if (s1.length()!= s2.length()) return false;
		else {
			for(char c = 'a'; c <= 'z'; c++) {
				int count1=0;
				int count2=0;
				
				for(int i=0;i<s1.length();i++) {
					if(s1.charAt(i)==c) count1++;
					if(s2.charAt(i)==c) count2++;
				}
				if(count1!=count2) return false;
			}
		return true;
		}
	}

	public static void main(String[] args) {

		Scanner inScanner = new Scanner(System.in);
		System.out.println("Enter your first string: ");
		String s1 = inScanner.nextLine().toLowerCase().replaceAll(" ", "");			
		
		System.out.println("Enter your second string: ");
		String s2 = inScanner.nextLine().toLowerCase().replaceAll(" ", "");		
		inScanner.close();
		
		if(checker(s1, s2)) System.out.println("They're anagrams!");
		else System.out.println("They're not anagrams!");
	}
}