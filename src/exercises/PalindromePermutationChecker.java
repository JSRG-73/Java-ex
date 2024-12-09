package exercises;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PalindromePermutationChecker {
	
		static String function1(String sentenceString) {
			
			sentenceString=sentenceString.replace(" ", "");
			sentenceString=sentenceString.replace("á", "a");
			sentenceString=sentenceString.replace("é", "e");
			sentenceString=sentenceString.replace("í", "i");
			sentenceString=sentenceString.replace("ó", "o");
			sentenceString=sentenceString.replace("ú", "u");
			sentenceString=sentenceString.toLowerCase();

			HashSet<String> set = new HashSet<>();
			boolean flag = false;
			sentenceString = sentenceString.replaceAll("!|,|\\.|\\?", "").toLowerCase().trim();
			String[] s_array = sentenceString.split("");
			
			for(int i =0;i<s_array.length;i++) set.add(s_array[i]);

			for (String s : set) {
				int count = 0;
				for(int i =0;i<s_array.length;i++) {
					if(s.equals(s_array[i])) count++;
				}
				if(count%2==1 && !flag) {
					flag=true;
					continue;
				}
				if(count%2==1 && flag) return "It's not a palindrome";
			}
			return "It's a palindrome";
		}

	public static void main(String[] args) {

		System.out.println(function1("a man a plan a canal panama"));
	}
}